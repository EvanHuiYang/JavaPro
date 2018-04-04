package intro.to.java.ch13.exercise;

import intro.to.java.ch13.GeometricObject;

public class PE1307 {
	public static void main(String[] args) {
		GeometricObject s = new Square(5.0, "cyan", true);
		
		if (s.isFilled()) {
			((Square)s).howToColor();
		} else {
			System.out.println("No color");
		}
		
		System.out.println(s.toString());
	}
}
