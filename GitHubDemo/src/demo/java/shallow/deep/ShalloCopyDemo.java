package demo.java.shallow.deep;

public class ShalloCopyDemo {
	public static void main(String[] args) {
		int[] data = {-5, 12, 0};
		ShallowCopy sc = new ShallowCopy(data);
		sc.showData();
		
		data[0] = 13;
		sc.showData();
	}
}
