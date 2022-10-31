/*
 * to print a number pyramid
 * @Auther: K Mohan
 * @Date: 30oct22
 */

//declaring the package
package com.patterns;

//declaring the class
public class Pattern5 {
    //main method
	public static void main(String[] args) {
	/*
		  1 
		 2 2
		3 3 3    */
		
		//creating the variables
		int n=6;
		int m=6;
		int num=1;
		
		//outer loop
		for(int i=1;i<=n;i++) {
			//innet loop-> spaces
			for(int j=m;j>i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(num+" ");
			}
			num++;
			System.out.println();
		}
	}
	//end of main
}
//end of class
