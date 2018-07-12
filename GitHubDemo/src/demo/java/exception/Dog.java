package demo.java.exception;

public class Dog {
	public static void main(String[] args) {
		Animal dog = null;
		try {
			dog = new Animal("I am a dog", -5);
		} catch (AgeAnimalException e) {
			System.out.println(e.getMessage());
		}
	}
}
