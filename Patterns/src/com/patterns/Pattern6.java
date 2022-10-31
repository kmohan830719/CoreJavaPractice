/*
 * to print a palindromic number pyramid
 * @Auther: K Mohan
 * @Date: 30oct22
 */

//declaring te package
package com.patterns;

//declaring the class
public class Pattern6 {
         //main method
	    public static void main(String[] args) {
	   /*
	    	   1
	    	  212
	    	 32123     */
	    	
		
	    	//outer for loop
	    	for(int i=1;i<=5;i++) {
	    		
	    		//inner loop-> spaces
	    		for(int j=i;j<=4;j++) {
	    			System.out.print(" ");
	    		}
	    		//inner loop-> first part
	    		for(int j=i;j>=1;j--) {
	    			System.out.print(j);
	    		}
	    		//inner loop-> second part
	    		for(int j=2;j<=i;j++) {
	    			System.out.print(j);
	    		}
	    		System.out.println();
	    	}
	}
	    //end of main
}
//end of class
