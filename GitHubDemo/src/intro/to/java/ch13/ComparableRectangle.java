package intro.to.java.ch13;

public class ComparableRectangle extends Rectangle {
	public ComparableRectangle(double width, double height) {
		super(width, height);
	}
	
	@Override
	public String toString() {
		return "Width: " + super.getWidth()
				+ " Height: " + super.getHeight()
				+ " Area: " + super.getArea();
	}
}
