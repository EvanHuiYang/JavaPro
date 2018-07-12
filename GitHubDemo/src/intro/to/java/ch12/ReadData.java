package intro.to.java.ch12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadData {
	public static void main(String[] args) throws IOException {
		// Create a File instance
		File file = new File("scores.txt");
		
		// Create a Scanner for the file
		Scanner input = new Scanner(file);
		
		// Read data from a file
		while (input.hasNext()) {
			String firstName = input.next();
			String middleName = input.next();
			String lastName = input.next();
			int score = input.nextInt();
			System.out.println(firstName + " "
					+ middleName + " "
					+ lastName + " "
					+ score);
		}
		
		// Close the file
		input.close();
	}
}
