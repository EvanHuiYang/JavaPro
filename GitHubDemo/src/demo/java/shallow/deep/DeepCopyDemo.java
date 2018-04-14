package demo.java.shallow.deep;

public class DeepCopyDemo {
	public static void main(String[] args) {
		int[] data = {1, 2, 3, 4};
		DeepCopy dc = new DeepCopy(data);
		dc.showData();
		
		data[0] = 5;
		dc.showData();
	}
}
