/*
 * to understand labelled Break/continue 
 * @Auther: K Mohan
 * @Date: 28oct22
 */

//declaring package
package com.forloop;

//declaring the class
public class BreakOuter {

	// main method
	public static void main(String[] args) {

		// outer for loop
		outer:for (int i = 1; i <= 10; i++) {
			
			//inner for loop
			for(int j=1;j<=i;j++) {
				if(i==j)
					break outer; //labelled break
				System.out.print(j+" ");
			}
			//end of inner loop
			System.out.println();
		}
		// end of outer loop
		
	}
	// end of main method
}
//end of class