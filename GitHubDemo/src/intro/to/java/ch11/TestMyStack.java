package intro.to.java.ch11;

import intro.to.java.ch13.Circle;

public class TestMyStack {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		
		Circle[] circles = {new Circle(1.2),
				new Circle(3.4), new Circle(5.6),
				new Circle(7.8), new Circle(9.0)};
		
		for (Circle circle : circles) {
			stack.push(circle);
		}
		
		for (int i = 0; i < stack.getSize(); i++) {
			System.out.println(stack.peek());
		}
	}
}
