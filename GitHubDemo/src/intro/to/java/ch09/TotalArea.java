package intro.to.java.ch09;

public class TotalArea {
	public static void main(String[] args) {
		CircleWithPrivateDataFields[] circleArray;
		circleArray = createCircleArray();
		printCircleArray(circleArray);
	}
	
	public static CircleWithPrivateDataFields[] createCircleArray() {
		CircleWithPrivateDataFields[] circleArray = 
				new CircleWithPrivateDataFields[5];
		
		for (int i = 0; i < circleArray.length; i++) {
			circleArray[i] =
					new CircleWithPrivateDataFields(Math.random() * 100);
		}
		
		return circleArray;
	}
	
	public static void printCircleArray(
			CircleWithPrivateDataFields[] circleArray) {
		System.out.printf("%-30s%-15s\n", "Radius", "Area");
		System.out.println("覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧");
		for (int i = 0; i < circleArray.length; i++) {
			System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(),
					circleArray[i].getArea());
		}
		System.out.println("覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧");
		System.out.printf("%-30s%-15f\n", "The total area of circle is",
				sum(circleArray));
	}
	
	public static double sum(CircleWithPrivateDataFields[] circleArray) {
		double sum = 0;
		
		for (int i = 0; i < circleArray.length; i++) {
			sum += circleArray[i].getArea();
		}
		
		return sum;
	}
}
