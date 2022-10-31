/*
 * to print the pattern
 * @Auther: K Mohan
 * @Date: 30oct22
 */

//declaring the package
package com.patterns;

//declaring the class
public class Pattern3 {

	//main method
	public static void main(String[] args) {
		/*
		 1
		 10
		 010
		 1010  */
		
		//outer for loop
		for(int i=1;i<=5;i++) {
			//inner for loop
			for(int j=1;j<=i;j++) {
				if((i+j)%2==0 ) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
		//end of loop
	}
	//end of main
}
//end of class
