/*
 * to print pattern(nested for loop)
 * @Auther: K Mohan
 * @Date: 28oct22
 */

//declaring package
package com.forloop;

//declaring the class
public class Pattern {
	
	//main method
	public static void main(String[] args) {
		
		//for loop to print [attern
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		//end of loop
	}
   //end of main method
}
//end of class
