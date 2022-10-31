/*
 * to print a solid rhombus
 * @Auther: K Mohan
 * @Date: 30oct22
 */

//declaring the package
package com.patterns;

//declaring the class
public class Pattern4 {
	//main method
	public static void main(String[] args) {
		 /*
		     ***
		    ***
		   ***     */
		
		//creating the variabes
		int n=5;
		int m=4;
		
		//outer for loop
		for(int i=1; i<=n; i++) {
			//inner loop-> spaces
			for(int j=1;j<n+1-i; j++) {
				System.out.print(" ");
			}
			//loop-> stars
			for(int j=1;j<=m;j++) {
				System.out.print("*");
			}
			 System.out.println();	
		}
	}
  //end of main
}
//end of class