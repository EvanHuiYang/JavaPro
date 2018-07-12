package demo.java.exception;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedExceptionDemo01 {
	public static void main(String[] args) throws IOException {
		String filePath = "D:/Personal/Evan/Practice/Java/"
				+ "File/G7Meeting.txt";
		
		/*
		 * This constructor FileInputStream(File fileName)
		 * throws FileNotFoundException which is a checked
		 * exception
		 */
		FileInputStream fis = new FileInputStream(filePath);
		
		int k;
		
		/*
		 * Method read() of FileInputStream class also throws
		 * a checked exception: IOException
		 */
		while ((k = fis.read()) != -1) {
			System.out.print((char)k);
		}
		
		/*
		 * The method close() closes the file input stream.
		 * It throws IOException
		 */
		fis.close();
	}
}
