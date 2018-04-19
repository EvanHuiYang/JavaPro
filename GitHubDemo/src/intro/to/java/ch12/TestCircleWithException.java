package intro.to.java.ch12;

public class TestCircleWithException {
	public static void main(String[] args) {
		try {
			CircleWithException[] circles = {
					new CircleWithException(5),
					new CircleWithException(0),
					new CircleWithException(-5)};
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		}
		
		System.out.println("Number of objects created: "
				+ CircleWithException.getNumberOfObjects());
	}
}
