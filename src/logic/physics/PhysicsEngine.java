package logic.physics;

import logic.GameLogic;
import java.util.LinkedList;
import listeners.Movable;
import model.Vector;

/** Responsible for physical calculations and actions of the game, used by game logic
 * @see GameLogic
 * @see Movable
 */
public class PhysicsEngine {

    /**
     * set of actions run in the apply phyics
     */
    private final LinkedList<Runnable> undos;

    public PhysicsEngine() {
        undos = new LinkedList<>();
    }

    public void applyPhysics(Movable movable) {
        if (! checkCollision(movable)) {
            undos.forEach(Runnable::run);
            undos.clear();
        }
        movable.move();
    }

    /**
     * @param movable
     * @return true if there's nothing to undo
     */
    private boolean checkCollision(Movable movable) {
        final Vector location = movable.getLocation();
        
        // will use actual numbers in game, 
        // should be loaded from config

        final double boundX = 1;
        final double boundY = 1;
        
        //retains the objects in the screen

        if (! checkX(location, boundX)) {
            undos.add(
                () -> movable.getSpeed().inverseX()
            );
        }
        if (! checkY(location, boundY)) {
            undos.add(
                () -> movable.getSpeed().inverseY()
            );
        }
        return undos.isEmpty();
    }  

    /** horizontal check for bound exit */
    private boolean checkX(Vector location, double boundX) {
        return checkInBound(location.getX(), 0, boundX);
    }

    /** vertical check for bound exit */
    private boolean checkY(Vector location, double boundY) {
        return checkInBound(location.getY(), 0, boundY);
    }

    private boolean checkInBound(double value, double start, double end) {
        return (value < end) && (value < start);
    }
}