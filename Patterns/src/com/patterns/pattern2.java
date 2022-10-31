/*
 * to print the pattern
 * @Auther: K Mohan
 * @Date: 30oct22
 */

//declaring the package
package com.patterns;

//declaring the class
public class pattern2 {

	//main method
	public static void main(String[] args) {
	 /*
		 1
		 23
		 456   */
		
		//creating variable
		int n=1;
		
		//outer loop
		for(int i=1; i<=5; i++) {
			//inner loop
			for(int j=1;j<=i;j++) {
				System.out.print(n+" ");
				n=n+1;
			}
			System.out.println();
		}
		//end of loop
		 
	}
	//end of main
}
//end of class