package listeners;

import model.Vector;

public interface Movable {

	default void move() {
		this.setLocation(
            this.getLocation().add(this.getSpeed())
        );
	}

	void setLocation(Vector newLocation);
	void setSpeed(Vector speed);
	Vector getLocation();
	Vector getSpeed();
}
