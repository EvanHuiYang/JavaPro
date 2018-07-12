package intro.to.java.ch12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteDataWithAutoClose {
	public static void main(String[] args) throws IOException {
		File file = new File("scores.txt");
		if (file.exists()) {
			file.delete();
		}
		
		try (PrintWriter output = new PrintWriter(file);) {
			output.println("try-with-resources demo");
			output.print("John T Smith ");
			output.println(90);
			output.print("Eric K Jones ");
			output.println(85);
		}
	}
}
