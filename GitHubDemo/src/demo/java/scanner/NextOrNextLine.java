package demo.java.scanner;

import java.util.Scanner;

public class NextOrNextLine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		scan.useDelimiter("\\.");
		scan.useDelimiter("<end>");
		System.out.println("You typed: " + scan.next());
		System.out.println("You typed: " + scan.next());
//		System.out.println("You typed: " + scan.nextLine());
	}
}
