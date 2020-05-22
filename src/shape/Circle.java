package shape;

import listeners.MyMouseListener;

public class Circle extends Shape {

	private int r;

	public Circle(int x , int y , int r  , int speedX ,  int speedY , MyMouseListener listener) {
		super(x, y, speedX)
	}
	

	public Circle(String data) {
		//to be implemented later
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
