package intro.to.java.ch13.exercise;

import intro.to.java.ch10.Course;

public class PE1313 {
	public static void main(String[] args) {
		Course course1 = new Course("Data Structures");
		
		course1.addStudent("Peter Jones");
		course1.addStudent("Kim Smith");
		course1.addStudent("Anne Kennedy");
		
		try {
			Course course2 = course1.clone();
			
			course2.addStudent("Jamal Jones");
			course2.addStudent("Steve Smith");
			
			System.out.println("\nNumber of student in course1: "
					+ course1.getNumberOfStudents());
			
			String[] students = course1.getStudents();
			for (int i = 0; i < course1.getNumberOfStudents(); i++) {
				System.out.print(students[i] + ", ");
			}
			System.out.println();
			
			System.out.println("\nNumber of students in course2: "
					+ course2.getNumberOfStudents());
			
			String[] students2 = course2.getStudents();
			for (int i = 0; i < course2.getNumberOfStudents(); i++) {
				System.out.print(students2[i] + ", ");
			}
			System.out.println();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
