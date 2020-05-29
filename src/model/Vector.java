package model;

public class Vector {

    private double x;
    private double y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Vector add(Vector vector) {
        this.x += vector.getX();
        this.y += vector.getY();
        return this;
    }

    public void inverseX() {
        this.x = -1 * x;
    }

    public void inverseY() {
        this.y = -1 * y;
    }

    public Vector inverse() {
        return new Vector(this.getX() * -1, this.getY() * -1);
    }
}