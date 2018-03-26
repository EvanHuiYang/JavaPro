package intro.to.java.ch13;

public class CheckPoint1331 {
	public static void main(String[] args) {
		Rational r1 = new Rational(-2, 6);
		Object r2 = new Rational(1, 45);
		
		System.out.println(r2 instanceof Rational);
		System.out.println(((Rational)r2).compareTo(r1));
	}
}
