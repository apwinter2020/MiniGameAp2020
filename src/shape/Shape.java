package shape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

import listeners.Movable;
import listeners.MyMouseListener;
import listeners.Paintable;
import mvvm.Data;

public class Shape implements Movable , Paintable{
	
	private int x;
	private int y;
	private int speedX;
	private int speedY;

	private Color color;
	private boolean isLive;
	private MyMouseListener listener;
	
	public Shape() {
		//
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getSpeedX() {
		return speedX;
	}

	public void setSpeedX(int speedX) {
		this.speedX = speedX;
	}

	public int getSpeedY() {
		return speedY;
	}

	public void setSpeedY(int speedY) {
		this.speedY = speedY;
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
	
	public Data toStringForPaint() {
		//to be implemented
		return null;
	}
}
