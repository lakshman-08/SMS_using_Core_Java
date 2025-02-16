package com.sms;
import java.util.ArrayList;

//This is the Main Class where it will Starts the Execution//
public class TestMain {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("Ravi", 12));
		students.add(new Student("Sita", 13));
		System.out.println("Student List:");
		for (Student s : students) {
		s.displayStudent();
		}

	}

}
