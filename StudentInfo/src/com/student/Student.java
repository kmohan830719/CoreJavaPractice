/*
 * to print student info
 * @Author: K Mohan
 * @Date: 26oct22
 */

//creating a package
package com.student;

//declaring class
public class Student {

	// instance variables
	int sid;
	String name;
	String course;

	// method to get details
	public void getDetails(int id, String n, String c) {
		sid = id;
		name = n;
		course = c;
	}

	// method to print details
	public void printDetails() {
		System.out.println("Student Details are:");
		System.out.println("Student id is :" + sid);
		System.out.println("Student name is :" + name);
		System.out.println("Student course is :" + course);
	}
	// end of method

}

//end of of class
