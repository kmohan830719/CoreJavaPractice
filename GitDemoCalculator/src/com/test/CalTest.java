/*
 * This is demo class to make calculator
 * @Author: K Mohan
 * @Date: 25oct22
 */

//creating a package
package com.test;

//importing scanner class
import java.util.Scanner;

//importing the package
import com.demo.Calculator;

//declaring class
public class CalTest {
	
	//method for presenting menu
	static void menu() {
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.exit");
		System.out.println("Enter choice");

	}

	//main method
	public static void main(String[] args) {
		
		//creating object of scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking user input
		System.out.println("Enter the first number");
		float num1=sc.nextFloat();
		System.out.println("Enter the second number");
		float num2=sc.nextFloat();
		
		//calling the method
		menu();
		
		//taking choice of user
		int choice=sc.nextInt();
		
		//switch case
		switch(choice) {
		case 1 -> Calculator.addition(num1,num2 );
		case 2 -> Calculator.subtraction(num1,num2 );
		case 3 -> Calculator.multiplication(num1,num2 );
		case 4 -> Calculator.division(num1,num2 );
		case 5 -> System.exit(0);
		default -> System.out.println("Invalid input......");
		}
		
		
	}
	//end of main method
}

//end of of class
