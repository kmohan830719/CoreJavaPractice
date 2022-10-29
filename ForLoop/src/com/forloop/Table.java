/*
 * to print the multiplication table using arguments
 * @Auther: K Mohan
 * @Date: 28oct22
 */

//declaring package
package com.forloop;

//declaring the class
public class Table {

	// main method
	public static void main(String[] args) {

		// creating variable
		int num = Integer.parseInt(args[0]);
		int table = 1;

		// for loop
		for (int i = 1; i <= 10; i++) {
			table = num * i;
			System.out.println(num + "*" + i + "= " + table);
		}
		// end of loop
	}
	// end of main method
}
//end of class