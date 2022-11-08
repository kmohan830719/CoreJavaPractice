/*
 * to understand the 'this' keyword
 * @Auther: K MOhan
 * @Date: 02nov22
 */
 //declaring the package
package com.demo;

//declaring the class
public class Example {

	//private variables
	private String name;
	
	// default constructor
	Example(){
		System.out.println("My name is Mohan");
	}
	
	//parameterised constructor
	Example(String name){
		this(); //calling the default constructor
		this.name=name;
	}
	
	//method
	public String getName() {
		return name;
	}
}
//end of class
