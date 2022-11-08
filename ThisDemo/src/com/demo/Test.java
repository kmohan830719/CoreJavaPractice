/*
 * to understand the 'this' keyword
 * @Auther: K MOhan
 * @Date: 02nov22
 */

 //declaring the package
package com.demo;

//declaring the class
public class Test {

	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating the object
		Example e1=new Example();
		System.out.println(e1.getName());
		Example e2=new Example("Mohan");
		System.out.println(e2.getName());
	}
   //end of the main
}
//end of class
