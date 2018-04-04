package intro.to.java.ch13.exercise;

import java.util.Scanner;

public class PE1301 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three sides of the triangle: ");
		double sideOne = input.nextDouble();
		double sideTwo = input.nextDouble();
		double sideThree = input.nextDouble();
		
		System.out.print("Enter a color: ");
		String color = input.next();
		
		System.out.print("Is the triangle filled (true / false)? ");
		boolean filled = input.nextBoolean();
		
		Triangle t = new Triangle(
				sideOne, sideTwo, sideThree, color, filled);
		
		System.out.println("\n" + t.toString());
		
		input.close();
	}
}
