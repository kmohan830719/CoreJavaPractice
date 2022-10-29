/*
 * to understand Break and Continue
 * @Auther: K Mohan
 * @Date: 28oct22
 */

//declaring package
package com.forloop;

//declaring the class
public class BreakContinue {

	// main method
	public static void main(String[] args) {

		// for loop
		System.out.println("-----break------");
		for (int i = 1; i <= 10; i++) {
			if (i == 5)
				break;
			System.out.println(i);
			// break: to come out of the loop
		}
		// end of loop

		// for loop
		System.out.println("-----continue------");
		for (int i = 1; i <= 10; i++) {
			if (i == 5)
				continue;
			System.out.println(i);

			// continue: skip the perticular iteration
		}
		// end of loop
		
		
	}
	// end of main method
}
//end of class
