/*
 * to print the pyramid pattern
 * @Auther: K Mohan
 * @Date: 28oct22
 */

//declaring package
package com.pattern;

//declaring the class
public class Pyramid1 {

	// method for pyramid pattern
	static void pattern1(int n) {
		// for loop
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		// end of loop
	}

	// method for pyramid pattern
	static void pattern2(int n) {
		// for loop
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		// end of loop
	}

	// main method
	public static void main(String[] args) {

		// calling the methods
		pattern1(5);
		System.out.println("-------------------");
		pattern2(5);
	}
	// end of main method
}
//end of class
