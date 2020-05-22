package shape;

import model.Vector;
import mvvm.Data;

public class Circle extends Shape {

	private int radius; // will be used to detect collisions in the future updates

	public Circle(Vector location, Vector speed, int radius) {
		super(location, speed);
		this.radius = radius;
	}

	public Circle(Data data) {
		super(data);
		this.radius = data.getWidth(); //either height or width doesn't matter
	}
}
