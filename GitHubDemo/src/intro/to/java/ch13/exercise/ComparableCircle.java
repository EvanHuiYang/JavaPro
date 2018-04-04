package intro.to.java.ch13.exercise;

import intro.to.java.ch13.Circle;

public class ComparableCircle extends Circle {
	public ComparableCircle() {
	}
	
	public ComparableCircle(double radius) {
		super(radius);
	}
	
	public ComparableCircle(
			double radius, String color, boolean filled) {
		super(radius, color, filled);
	}
}
