package intro.to.java.ch13;

import java.util.Arrays;

class Person implements Comparable<Person> {
	private int id;
	
	Person(int id) {
		this.id = id;
	}
	
	@Override
	public int compareTo(Person p) {
		if (this.id > p.id) {
			return 1;
		} else if (this.id < p.id) {
			return -1;
		} else {
			return 0;
		}
	}
}

public class CheckPoint1321 {
	public static void main(String[] args) {
		Person[] persons = {
				new Person(3), new Person(4), new Person(1)};
		
		Arrays.sort(persons);
		
		for (Person person : persons) {
			System.out.println(person);
		}
	}
}
