package intro.to.java.ch12;

public class TestCircleWithCustomException {
	public static void main(String[] args) {
		try {
			new CircleWithCustomException(5);
			new CircleWithCustomException(-5);
			new CircleWithCustomException(0);
		} catch (InvalidRadiusException e) {
			System.out.println(e);
		}
		
		System.out.println("Number of objects created: "
				+ CircleWithCustomException.getNumberOfObjects());
	}
}
