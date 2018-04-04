package intro.to.java.ch13.exercise;

import java.util.ArrayList;
import java.util.Collections;

public class PE1302 {
	public static void shuffle(ArrayList<Number> list) {
		Collections.shuffle(list);
	}
	
	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<>();
		list.add(10);
		list.add(7.8);
		list.add(9.8);
		list.add(1.2);
		list.add(3);
		list.add(2.3);
		list.add(5.6);
		list.add(4.321);
		list.add(21.01);
		System.out.println(list.toString());
		shuffle(list);
		System.out.println(list.toString());
	}
}
