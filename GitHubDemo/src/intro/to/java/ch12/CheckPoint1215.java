package intro.to.java.ch12;

public class CheckPoint1215 {
	public static void method() throws Exception {
		System.out.println(1 / 0);
	}
	
	public static void main(String[] args) {
		try {
			method();
			System.out.println("After the method call");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch (RuntimeException e) {
			System.out.println("RuntimeException");
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}
}