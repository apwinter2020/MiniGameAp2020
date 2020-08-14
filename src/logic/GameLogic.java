package logic;

import java.util.List;

import controller.Administrator;
import logic.physics.PhysicsEngine;
import model.GameObject;

public class GameLogic {

    private boolean isRunning = true;
    private final PhysicsEngine engine;

    public GameLogic() {
        engine = new PhysicsEngine();
        start();
    }

    public void start() {
        new Thread(this::run);
    }

    private void run() {
        while (isRunning) {
            update();
            doWait();
        }
    }

    private void update() {
        final List<GameObject> gameObjects = Administrator.getInstance().getGameObjects();
        gameObjects.forEach(
            engine::applyPhysics
        );
        //objects coming here
        //do logic
    }

    /**
     * steadies the update rate of logic, 
     * it wasn't of much necessity
     */
    private void doWait() {
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}