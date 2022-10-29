/*
 * to print the factorial of a number
 * @Auther: K Mohan
 * @Date: 28oct22
 */

//declaring package
package com.forloop;

//importing the package
import java.util.*;

//declaring the class
public class Factorial {

	// method for factorials
	private static void printFactorial(int num) {

		// loop to print factorials
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
			System.out.print(fact + " ");
		}
		System.out.println("\n" + "The factorial of " + num + " is: " + fact);

		// loop to print factorials in reverse
		int fact2=1;
		for (int i = num; i >1; i--) {
			fact2 = fact2 * i;
			System.out.print(fact2 + " ");
		}
		System.out.println("\n" + "The factorial of " + num + " is: " + fact2);
	}
	// end of method

	// main method
	public static void main(String[] args) {

		//creating the object of Scanner class
		Scanner sc = new Scanner(System.in);
		//taking user input
		System.out.println("Enter the number");
		int num = sc.nextInt();

		//calling the method
		printFactorial(num);
		
		sc.close();

	}
	// end of main method
}
//end of class
