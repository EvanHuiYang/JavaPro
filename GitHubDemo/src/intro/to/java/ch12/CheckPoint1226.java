package intro.to.java.ch12;

public class CheckPoint1226 {
	public static void method() throws Exception {
		try {
			CircleWithCustomException c1 = 
					new CircleWithCustomException(1);
			c1.setRadius(-1);
			System.out.println(c1.getRadius());
		} catch (RuntimeException e) {
			System.out.println("RuntimeException in method()");
		} catch (Exception e) {
			System.out.println("Exception in method()");
			throw e;
		}
	}
	
	public static void main(String[] args) {
		try {
			method();
			System.out.println("After the method call");
		} catch (RuntimeException e) {
			System.out.println("RuntimeException in main");
		} catch (Exception e) {
			System.out.println("Exception in main");
		}
	}
}
