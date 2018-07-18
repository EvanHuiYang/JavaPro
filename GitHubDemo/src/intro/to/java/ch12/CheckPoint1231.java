package intro.to.java.ch12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CheckPoint1231 {
	public static void main(String[] args) {
		try (PrintWriter output = new PrintWriter("temp.txt");) {
			output.printf("amount is %f %e\r\n", 32.32, 32.32);
			output.printf("amount is %5.4f %5.4e\r\n", 32.32, 32.32);
			output.printf("%6b\r\n", (1 > 2));
			output.printf("%6s\r\n", "Java");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File file = new File("temp.txt");
		
		try (Scanner input = new Scanner(file);) {
			while (input.hasNextLine()) {
				String lineContent = input.nextLine();
				System.out.println(lineContent);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*try {
			PrintWriter output = new PrintWriter("temp.txt");
			output.printf("amount is %f %e\r\n", 32.32, 32.32);
			output.printf("amount is %5.4f %5.4e\r\n", 32.32, 32.32);
			output.printf("%6b\r\n", (1 > 2));
			output.printf("%6s\r\n", "Java");
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
	}
}
