package intro.to.java.ch13.exercise;

public class PE1312 {
	public static double sumArea(GeometricObject[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i].getArea();
		}
		return sum;
	}
	
	public static void main(String[] args) {
		GeometricObject[] a = {new Circle(1.2), new Circle(3.4),
				new Rectangle(5.6, 7.8), new Rectangle(9.0, 0.9)};
		
		System.out.println("Sum of the areas: " + sumArea(a));
	}
}
