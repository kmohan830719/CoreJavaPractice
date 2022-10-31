/*
 * to print the star pattern
 * @Auther: K Mohan
 * @Date: 28oct22
 */

//declaring the package
package com.pattern;

//declaring the class
public class Star {
	
	//method to print star pattern
	static void starPattern(int n) {
		
		//for loop
		for(int i=1;i<=n;i++) {
			//inner llop for spaces
			for(int j=n-1;j>=i;j--) {
				System.out.print(" ");
			}
			//inner loop to print star
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println("\n");
		}
	}
	//main method
	public static void main(String[] args) {
		
		//calling the method
		starPattern(5);
	}
	//end of method
}
//end of the class
