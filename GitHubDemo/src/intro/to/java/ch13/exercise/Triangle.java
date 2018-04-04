package intro.to.java.ch13.exercise;

import intro.to.java.ch13.GeometricObject;

public class Triangle extends GeometricObject {
	private double sideOne;
	private double sideTwo;
	private double sideThree;
	private double halfPerimeter;
	
	public Triangle() {
		sideOne = 0.0;
		sideTwo = 0.0;
		sideThree = 0.0;
	}
	
	public Triangle(double sideOne, double sideTwo, double sideThree) {
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
		this.sideThree = sideThree;
	}
	
	public Triangle(double sideOne, double sideTwo, double sideThree,
			String color, boolean filled) {
		
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
		this.sideThree = sideThree;
		super.setColor(color);
		super.setFilled(filled);
	}
	
	public double getSideOne() {
		return sideOne;
	}
	
	public void setSideOne(double sideOne) {
		this.sideOne = sideOne;
	}
	
	public double getSideTwo() {
		return sideTwo;
	}
	
	public void setSideTwo(double sideTwo) {
		this.sideTwo = sideTwo;
	}
	
	public double getSideThree() {
		return sideThree;
	}
	
	public void setSideThree(double sideThree) {
		this.sideThree = sideThree;
	}
	
	public double getHalfPerimeter() {
		halfPerimeter = (sideOne + sideTwo + sideThree) / 2;
		return halfPerimeter;
	}
	
	@Override
	public double getArea() {
		return Math.sqrt(halfPerimeter * (halfPerimeter - sideOne)
				* (halfPerimeter - sideTwo)
				* (halfPerimeter - sideThree));
	}
	
	@Override
	public double getPerimeter() {
		return (sideOne + sideTwo + sideThree);
	}
	
	@Override
	public String toString() {
		return "Side 1: " + sideOne
				+ "\nSide 2: " + sideTwo
				+ "\nSide 3: " + sideThree
				+ "\nColor: " + super.getColor()
				+ "\nFilled: " + super.isFilled()
				+ "\nHalf Perimeter: " + getHalfPerimeter()
				+ "\nArea: " + getArea()
				+ "\nPerimeter: " + getPerimeter();
	}
}
