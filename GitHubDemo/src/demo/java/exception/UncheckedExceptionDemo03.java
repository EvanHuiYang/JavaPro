package demo.java.exception;

public class UncheckedExceptionDemo03 {
	public static void main(String[] args) {
		try {
			int[] intArray = {1, 2, 3, 4, 5};
			System.out.println(intArray[7]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The specified index does not exist "
					+ "in array. Please correct the error.");
		}
	}
}