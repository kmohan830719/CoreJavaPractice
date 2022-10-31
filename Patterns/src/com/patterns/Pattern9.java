/*
 * to print a inverted half piramid of no's
 * @Auther: K Mohan
 * @Date: 30oct22
 */

//declaring the package
package com.patterns;

//declaring the class
public class Pattern9 {
	//main method
     public static void main(String[] args) {
   /*
    	 1111
    	 222
    	 33
    	 4     */
    	
    	 
    	 //variables
    	 int m=5;
    	 
    	 //outer loop
    	 for(int i=1; i<=m; i++) {
    		 
    		 //inner loop
    		 for(int j=i;j<=5;j++) {
    			 System.out.print(i);
    		 }
    		 System.out.println();
    	 }
    	//end of loop 
  	
	}
   //end of main method
}
//end of class