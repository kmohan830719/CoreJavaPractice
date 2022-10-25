/*
 * This is demo class to test package
 * @Author: K Mohan
 * @Date: 25oct22
 */

//creating a package
package com.mypack;

//importing the package
import com.loops.Demo;

//declaring class
public class Test1 {

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