package demo.java.exception;

public class ThrowsDemo01 {
	public static void main(String[] args) {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Hello Geeks");
	}
}
