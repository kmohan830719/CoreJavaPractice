//Program: WAP to print the remarks according to the grade
//@Auther:K Mohan
//@Date: 19oct22

//imopting package
import java.util.*;

//Declaring the class
class SwitchCase1{
	
    //creating method to print the remarks
	static void printRemarks(char gr){
		switch(gr){
			case 'A': System.out.println("Excellent Work...");
			          break;
		    case 'B': System.out.println("Very Good...");
			          break;
			case 'C': System.out.println("Good...need to improve");
			          break;
		    case 'D': System.out.println("Fair...work hard");
			          break;
			case 'F': System.out.println("Sorry! you are failed...");
			          break;
			default:  System.out.println("Wrong Input");
			
		}
	}
		//end of method printRemarks
		
	//main method
	public static void main(String[] args){
		
		//creating the object of Scanner and taking input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Grade");
		char grade=sc.next().charAt(0);
		
		//calling the method to print remarks
		printRemarks(grade);
	}
   //end of main
}
//end of Class SwitchCase