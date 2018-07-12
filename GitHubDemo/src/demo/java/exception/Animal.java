package demo.java.exception;

public class Animal {
	private String name;
	private int age;
	
	public Animal(String name, int age) throws AgeAnimalException {
		if (age < 0) {
			throw new AgeAnimalException("An Animal object "
					+ "can't have a negative age: " + age);
		} else {
			this.name = name;
			this.age = age;
			System.out.println("You have created a dog");
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void eat() {
	}
	
	public void makeSound() {
	}
}
