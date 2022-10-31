/*
 * to print a daimond pattern
 * @Auther: K Mohan
 * @Date: 30oct22
 */

//declaring the package
package com.patterns;

//declaring the class
public class Pattern8 {
	//main method
     public static void main(String[] args) {
     /*
    	    *
    	   ***
    	  *****
    	   ***
    	    *        */
    	
    	 
    	 //variables
    	 int m=5;
    	 
    	 //outer loop
    	 for(int i=1; i<=m; i++) {
    		 //inner loop
    		 for(int j=i;j<=m-1;j++) {
    			 System.out.print(" ");  //spaces
    		 }
    		 for(int j=1;j<=i;j++) {
    			 System.out.print("*");
    		 }
    		 for(int j=2;j<=i;j++) {
    			 System.out.print("*");
    		 }
    		 System.out.println();
    	 }
    	 // creating variables
    	 int n=4;
    	 //outer loop
    	 for(int i=n; i>=1; i--) {
    		 //innet loop
    		 for(int j=i;j<=n;j++) {
    			 System.out.print(" "); //printing spaces
    		 }
    		 for(int j=1;j<=i;j++) {
    			 System.out.print("*");
    		 }
    		 for(int j=2;j<=i;j++) {
    			 System.out.print("*");
    		 }
    		 System.out.println();
    	 }
    	//end of loop 	
	}
   //end of main method
}
//end of class
