/*
 * to print a butterfly pattern
 * @Auther: K Mohan
 * @Date: 30oct22
 */

//declaring the package
package com.patterns;

//declaring the class
public class Pattern7 {
	// main method
	public static void main(String[] args) {
	/*
		 *    *
		 **  **
		 ******
		 **  **
		 *    *     */
		
		//creating the variables
		int n=5;
		
		//outer loop for upper part
		for(int i=1; i<=n;i++) {
			//inner loop
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			int spaces=2*(n-i);
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	    int m=4;
	    
		//outer for for lower part
		for(int i=m; i>=1;i--) {
			//inner loop
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			int spaces=2*(n-i);
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		 
	}
//end of main
}
//end of the class
