/*
 * to check whether a number is prime or not
 * @Auther: K Mohan
 * @Date: 28oct22
 */

//declaring package
package com.forloop;

//importing the package
import java.util.*;

//declaring the class
public class PrimeNumber {

	// method to check prime number
	private static void checkPrime(int num) {
		// boolean variable
		boolean flag = false;

		// checking for prime number
		if (num == 0 || num == 1) {
			System.out.println(num + " is not a prime number");
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					System.out.println(num + " is not a prime number");
					flag = true;
					break;
				}
				if (!flag) {
					System.out.println(num + " is a prime number");
				}
			}
		}

	}
	// end of method

	// main method
	public static void main(String[] args) {

		// creating the object of Scanner class
		Scanner sc = new Scanner(System.in);
		// taking user input
		System.out.println("Enter the number");
		int num = sc.nextInt();

		// calling the method
		checkPrime(num);

		sc.close();
	}
	// end of main method
}
//end of class