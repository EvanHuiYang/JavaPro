package intro.to.java.ch12;

public class CheckPoint1205 {
	public static void main(String[] args) {
		try {
			int value = 50;
			if (value < 40) {
				throw new Exception("value is too small");
			} 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Continue after the catch block");
	}
}
