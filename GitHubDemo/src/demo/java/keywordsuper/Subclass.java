package demo.java.keywordsuper;

public class Subclass extends Superclass {
	// Overrides printMethod in Superclass
	public void printMethod() {
		super.printMethod();
		System.out.println("Printed in Subclass");
	}
	
	public static void main(String[] args) {
		Subclass s = new Subclass();
		s.printMethod();
	}
}
