package intro.to.java.ch13.exercise;

public class PE1311 {
	public static void main(String[] args) {
		Octagon oct1 = new Octagon(5);
		Octagon oct2;
		
		try {
			oct2 = (Octagon)oct1.clone();
			System.out.println(oct1.toString());
			
			oct2.setSide(6);
			if (oct1.compareTo(oct2) == 0) {
				System.out.println("oct1 is equal to oct2.");
			} else {
				System.out.println("oct1 is not equal to oct2.");
			}
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
