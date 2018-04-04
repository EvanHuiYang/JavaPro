package intro.to.java.ch13.exercise;

import intro.to.java.ch11.MyStack;

public class PE1308 {
	public static void main(String[] args) {
		MyStack stack1 = new MyStack();
		MyStack stack2;
		
		try {
			System.out.println(
					"Pushing the number 4, 5, and 6 to 1st stack...");
			stack1.push(new Integer(4));
			stack1.push(new Integer(5));
			stack1.push(new Integer(6));
			
			System.out.println("Cloning 1st stack...");
			stack2 = (MyStack)stack1.clone();
			
			System.out.println("Popping object from 1st stack...");
			stack1.pop();
			
			System.out.print("1st ");
			System.out.println(stack1);
			System.out.print("2nd ");
			System.out.println(stack2);
			System.out.println("Is the 1st stack equal to the 2nd? "
					+ (stack1 == stack2));
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
