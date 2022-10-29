/*
 * to print student info
 * @Author: K Mohan
 * @Date: 26oct22
 */

//creating a package
package com.test;

//importing package
import java.util.*;

//importing package
import com.student.Student;

//declaring class
public class StudentTest {

	// main method
	public static void main(String[] args) {

		// creating object of class
		Student s1 = new Student();
		Student s2 = new Student();

		// creating object of Scanner class
		Scanner sc = new Scanner(System.in);

		// declaring variables
		int id;
		String name, course;

		// taking user input
		System.out.println("Enter your name");
		name = sc.nextLine();
		System.out.println("Enter your ID");
		id = sc.nextInt();
		System.out.println("Enter your course");
		course = sc.next();

		// calling the method
		s1.getDetails(id, name, course);
		System.out.println("--------------------------");

		// taking user input
		System.out.println("Enter your name");
		name = sc.next();
		System.out.println("Enter your ID");
		id = sc.nextInt();
		System.out.println("Enter your course");
		course = sc.next();

		// calling the method
		s2.getDetails(id, name, course);
		System.out.println("--------------------------");

		// calling the method
		s1.printDetails();
		System.out.println("--------------------------");
		// calling the method
		s2.printDetails();

		sc.close();
	}
	// end of main method
}

//end of of class