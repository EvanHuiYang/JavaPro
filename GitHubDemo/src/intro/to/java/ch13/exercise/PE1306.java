package intro.to.java.ch13.exercise;

public class PE1306 {
	public static void main(String[] args) {
		ComparableCircle[] circles = {
				new ComparableCircle(4.5),
				new ComparableCircle(4.3)};
		System.out.println(circles[0].compareTo(circles[1]));
	}
}
