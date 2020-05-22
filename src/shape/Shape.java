package shape;

import java.awt.Color;
import java.awt.Graphics;

import listeners.MyMouseListener;
import model.GameObject;
import model.Vector;
import mvvm.Data;

public class Shape implements GameObject {

	private Vector location;
	private Vector speed;

	private Color color;
	private boolean isLive;
	private MyMouseListener listener;

	public Shape(int x, int y, int r, int speedX, int speedY) {
		//
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public boolean isLive() {
		return isLive;
	}

	public void setLive(boolean isLive) {
		this.isLive = isLive;
	}

	public MyMouseListener getListener() {
		return listener;
	}

	public void setListener(MyMouseListener listener) {
		this.listener = listener;
	}

	@Override
	public void paint(Graphics g) {
		//
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	public Data getDataToPaint() {
		return null;
	}

	public Data toStringForPaint() {
		//to be implemented
		return null;
	}

	public Data getDataToPaint() {
		return null;
	}

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
}
