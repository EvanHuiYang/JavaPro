package demo.java.pattern.factory;

public class DogFactoryDemo {
	public static void main(String[] args) {
		Dog dog = DogFactory.getDog("small");
		dog.speak();
		
		dog = DogFactory.getDog("big");
		dog.speak();
		
		dog = DogFactory.getDog("working");
		dog.speak();
	}
}
