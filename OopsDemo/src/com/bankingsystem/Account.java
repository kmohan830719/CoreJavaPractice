/*
 * Program for the banking System
 * @Auther: K Mohan
 * @Date: 01nov22
 */

//declaring the package
package com.bankingsystem;

//declaring the class Account
public class Account {
	
	//creating private variables
	private int accId;
	private String accHolderName;
	private double balance;
	private String panNumber;
	
	//method to take details
	void accDetails(int id,String name,double bal,String pan) {
		
		accId=id;
		accHolderName=name;
		balance=bal;
		panNumber=pan;
	}
	
	//method to take details (polymorphisn)
	void accDetails(int id,String name,double bal) {
		
		accId=id;
		accHolderName=name;
		balance=bal;
	}
	
	
	//method for deposite
	double deposite(double bal) {
		
		balance+=bal;
		return balance;
	}
	
	//method for withdrawal
	double withdrawal(double amount) {
		
		if(balance>=(amount+500)) {
			balance-=amount;
			System.out.println("your remaining balance is: "+balance);
			}else {
				System.out.println("your balance is low cant do withdrawal");
			}
		return balance;
	}
	//method to print details
	void printDetails() {
		System.out.println("The Account Id is: "+accId);
		System.out.println("Account holder name is: "+accHolderName);
		System.out.println("The Account balance is: "+balance);
		System.out.println("--------------------------");
	}
	//method for pan details
	String pan() {
		
		return panNumber;
	}
}
//end of class
