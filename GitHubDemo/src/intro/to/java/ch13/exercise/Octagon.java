package intro.to.java.ch13.exercise;

public class Octagon
		extends GeometricObject
		implements Comparable<Octagon>, Cloneable {
	
	private double side;
	
	public Octagon() {
	}
	
	public Octagon(double side) {
		this.side = side;
	}
	
	public Octagon(double side, String color, boolean filled) {
		this.side = side;
		super.setColor(color);
		super.setFilled(filled);
	}
	
	public double getSide() {
		return side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}
	
	@Override
	public int compareTo(Octagon o) {
		if (this.getArea() > o.getArea()) {
			return 1;
		} else if (this.getArea() < o.getArea()) {
			return -1;
		} else {
			return 0;
		}
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public double getArea() {
		return (2 + 4 / Math.sqrt(2)) * side * side;
	}
	
	@Override
	public double getPerimeter() {
		return 8 * side;
	}
	
	@Override
	public String toString() {
		return "Area: " + getArea()
				+ "\nPerimeter: " + getPerimeter();
	}
}
