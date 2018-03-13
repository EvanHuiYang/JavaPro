package intro.to.java.ch13;

public class CheckPoint1326 {
	public static void main(String[] args) {		
		try {
			GeometricObject x = new Circle(3);
			GeometricObject y = (GeometricObject)(x.clone());
			System.out.println(x == y);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
