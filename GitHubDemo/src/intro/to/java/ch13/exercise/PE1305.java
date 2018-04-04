package intro.to.java.ch13.exercise;

import intro.to.java.ch13.Circle;
import intro.to.java.ch13.GeometricObject;
import intro.to.java.ch13.Rectangle;

public class PE1305 {
	public static void main(String[] args) {
		GeometricObject o1 = new Circle(5, "yellow", true);
		GeometricObject o2 = new Circle(4, "blue", false);
		
		GeometricObject o3 = new Rectangle(4, 5, "cyan", false);
		GeometricObject o4 = new Rectangle(3, 4, "green", true);
		
		System.out.println(GeometricObject.max(o1, o2));
		System.out.println(GeometricObject.max(o3, o4));
	}
}
