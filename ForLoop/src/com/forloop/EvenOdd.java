/*
 * to print even and odd numbers
 * @Auther: K Mohan
 * @Date: 28oct22
 */

//declaring package
package com.forloop;

//declaring the class
public class EvenOdd{
	
	//method to print even numbers
	static void evenNumber() {
		int num=1;
		//for loop
		for(int i=1;i<=20;i++) {
			num=i*2;
			System.out.println(num);
		}
		//end of loop
	}
	
	//method to print odd numbers
		static void oddNumber() {
			int num=1;
			//for loop
			for(int i=1;i<=20;i++) {
				num=(i*2)+1;
				System.out.println(num);
			}
			//end of loop
		}
	
	//main method
	public static void main(String[] args) {
		//calling the methods
		evenNumber();
		oddNumber();
		
		
	}
   //end of main method
}
//end of class