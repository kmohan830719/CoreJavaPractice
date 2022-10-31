/*
 * to print the pattern
 * @Auther: K Mohan
 * @Date: 30oct22
 */

//declaring the package
package com.patterns;

//declaring class
public class Pattern1 {

	// main method
	public static void main(String[] args) {
		/* *****
		   *   *
		   *   *
		   *****  */
		
        //declaring variables
		int n = 5;
		int m = 5;
		
		//outer loop
		for (int i=1; i<=n; i++) {
			//inner loop
			for (int j=1; j<=m; j++) {
				if (i==1 || i==5 || j==1 || j==5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
	//end of main method
}
//end of class
