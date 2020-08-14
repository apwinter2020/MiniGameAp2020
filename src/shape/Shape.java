package shape;

import java.awt.Color;
import listeners.Collidable;
import listeners.Paintable;
import model.GameObject;
import model.Vector;
import mvvm.Data;

// move to model?
public class Shape implements GameObject, Paintable {

	private Vector location;
	private Vector speed;

	private Color color;
	private boolean isAlive;

	public Shape(Vector location, Vector speed) {
		this.location = location;
		this.speed = speed;
	}

	public Shape(Vector location) {
		this(location, new Vector(0, 0));
	}

	public Shape(Data data) {
		this.setLocation(
			new Vector(data.getX(), data.getY()));
		this.setSpeed(
			new Vector(0,0));
	}

	//paintable attributes
	@Override
	public Color getColor() {
		return color;
	}

	@Override
	public void setColor(Color color) {
		this.color = color;
	}

	//animate attributes
	@Override
	public boolean isAlive() {
		return isAlive;
	}

	@Override
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	//game object attributes
	@Override
	public void setLocation(Vector newLocation) {
		this.location = newLocation;
	}

	@Override
	public void setSpeed(Vector speed) {
		this.speed = speed;
	}

	@Override
	public Vector getLocation() {
		return location;
	}

	@Override
	public Vector getSpeed() {
		return speed;
	}

	@Override
	public boolean collides(Collidable other) {
		return false; // to be implemented in the last releases maybe
	}

	@Override
	public Data toData() {
		// can be send across the network
		return null;
	}
}
