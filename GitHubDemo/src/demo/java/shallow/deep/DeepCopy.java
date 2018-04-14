package demo.java.shallow.deep;

import java.util.Arrays;

public class DeepCopy {
	private int[] data;
	
	public DeepCopy(int[] data) {
		this.data = new int[data.length];
		for (int i = 0; i < this.data.length; i++) {
			this.data[i] = data[i];
		}
	}
	
	public void showData() {
		System.out.println(Arrays.toString(data));
	}
}
