package demo.java.exception;

public class UncheckedExceptionDemo02 {
	public static void main(String[] args) {
		int[] intArray = {1, 2, 3, 4, 5};
		
		/*
		 * My array has only 5 elements but we are trying to
		 * display the value of 8th element. It should throw
		 * ArrayIndexOutOfBoundsException
		 */
		System.out.println(intArray[7]);
	}
}