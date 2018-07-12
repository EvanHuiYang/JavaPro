package demo.java.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionDemo02 {
	public static void main(String[] args) {
		String filePath = "D:/Personal/Evan/Practice/Java/"
				+ "File/G7Meeting0.txt";
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(filePath);
			int k;
			while ((k = fis.read()) != -1) {
				System.out.print((char)k);
			}
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("The specified file is not "
					+ "present at the given path.");
		} catch (IOException e) {
			System.out.println("I/O error occurred: " + e);
		}
	}
}
