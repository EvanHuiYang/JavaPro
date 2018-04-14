package intro.to.java.ch09;

public class TestCircleWithPrivateDataFields {
	public static void main(String[] args) {
		CircleWithPrivateDataFields myCircle =
				new CircleWithPrivateDataFields(5.0);
		CircleWithPrivateDataFields myCircle1 = 
				new CircleWithPrivateDataFields(6.0);
		
		/*System.out.println("The area of the circle of radius "
				+ myCircle.getRadius() + " is " + myCircle.getArea());
		
		myCircle.setRadius(myCircle.getRadius() * 1.1);
		System.out.println("The area of the circle of radius "
				+ myCircle.getRadius() + " is " + myCircle.getArea());
		
		System.out.println("The number of objects created is "
				+ CircleWithPrivateDataFields.getNumberOfObjects());*/
		
		printCircle(myCircle);
		printCircle(myCircle1);
	}
	
	public static void printCircle(CircleWithPrivateDataFields c) {
		System.out.println("The area of the circle of radius "
				+ c.getRadius() + " is " + c.getArea());
	}
}
