package intro.to.java.ch12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteData {
	public static void main(String[] args) throws IOException {
		File file = new File("scores.txt");
		if (file.exists()) {
			file.delete();
		}
		
		// Create a file
		PrintWriter output = new PrintWriter(file);
		
		// Write formatted output to the file
		output.print("John T Smith ");
		output.println(90);
		output.print("Eric K Jones ");
		output.println(85);
		
		// Close the file
		output.close();
	}
}
