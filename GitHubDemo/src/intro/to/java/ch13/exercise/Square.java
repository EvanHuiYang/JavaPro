package intro.to.java.ch13.exercise;

import intro.to.java.ch13.GeometricObject;

public class Square extends GeometricObject implements Colorable {
	private double side;
	
	public Square() {
		side = 1.0;
	}
	
	public Square(double side) {
		this.side = side;
	}
	
	public Square(double side, String color, boolean filled) {
		this.side = side;
		super.setColor(color);
		super.setFilled(filled);
	}
	
	@Override
	public double getArea() {
		return Math.pow(side, 2);
	}
	
	@Override
	public double getPerimeter() {
		return 4 * side;
	}
	
	@Override
	public void howToColor() {
		System.out.println("Color all four sides.");
	}
	
	@Override
	public String toString() {
		return "Side: " + side
				+ "\nArea: " + getArea()
				+ "\nPerimeter: " + getPerimeter();
	}
}
