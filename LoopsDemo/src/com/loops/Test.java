/*
 * This is demo class to test package
 * @Author: K Mohan
 * @Date: 25oct22
 */

//creating a package
package com.loops;

//declaring class
public class Test {

	//main method
	public static void main(String[] args) {
		
		//creating an object of Demo class
		Demo obj=new Demo();
		
		//calling the method
		obj.printValue();
		
		//calling static directory with name of class: no object required
		Demo.printMessage();
	}
	//end of main method
}

//end of of class