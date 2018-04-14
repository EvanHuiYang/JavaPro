package demo.java.shallow.deep;

import java.util.Arrays;

public class ShallowCopy {
	private int[] data;
	
	public ShallowCopy(int[] data) {
		this.data = data;
	}
	
	public void showData() {
		System.out.println(Arrays.toString(data));
	}
}
