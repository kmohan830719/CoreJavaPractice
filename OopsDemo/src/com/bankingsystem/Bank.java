/*
 * Program for the banking System
 * @Auther: K Mohan
 * @Date: 01nov22
 */

//declaring the package
package com.bankingsystem;

//importing the package
import java.util.*;

//declaring the Bank class
public class Bank {
	
	//method to show menu
	static void menu() {
		
		System.out.println("1. Account Creation");
		System.out.println("2. Money Deposite");
		System.out.println("3. Money withdrawal");
		System.out.println("4. Display Bank Details");
		System.out.println("5. Exit");
		System.out.println("Enter your choice");
	}
	//end of method
      
	//main method 
	public static void main(String[] args) {
		
		//creating the objects
		Account a1=new Account();
		
		//creating an object of scanner class
		Scanner sc=new Scanner(System.in);
	
		int choice=0;
		//do while loop
		do {
			//calling the method
			menu();
			
			//taking the user choice
		    choice=sc.nextInt();
			
		//switch case
		switch(choice) {
		case 1:
			System.out.println("Enter the Account Id:");
			int id=sc.nextInt();
			System.out.println("Enter your name");
			String name=sc.next();
			System.out.println("Enter the amount");
			double bal=sc.nextDouble();
			//condition for pan reqirement
			if(bal>3000) {
				System.out.println("Enter the pan number");
				String pan=sc.next();
				//calling the method
				a1.accDetails(id, name, bal,pan);
			}else {
				//calling the method
				a1.accDetails(id, name, bal);
			}
		    System.out.println("Congrats!! your account is created");
		    System.out.println("--------------------");
		    break;
		    
		case 2: System.out.println("Enter the amount you want to deposite");
		        double amnt=sc.nextDouble();
		        //calling the method
		       System.out.println("Balanec: "+ a1.deposite(amnt));
		       System.out.println("--------------------");
		       break;
		       
		case 3:System.out.println("Enter the amount");
		       double amount=sc.nextDouble();
		       //calling the method
		       System.out.println("Balance: "+a1.withdrawal(amount));
		       System.out.println("--------------------");
		       break;
		       
		case 4:System.out.println("The Account Details are");
		       System.out.println("..................");
			   //calling the method
			   a1.printDetails();
			   break;
			   
		case 5: System.exit(0);	
		       break;
		
		default:System.out.println("Invalid Input");	
		}
		//end of switch
		
		System.out.println("Do you want to do more (1=yes/2=no)");
	    choice=sc.nextInt();
		}while(choice==1);
		//end of while
		
		sc.close();
	}
	//end of main method
}
//end of the class
