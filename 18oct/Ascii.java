//program: To print the Ascii Value using Scanner class
//@Author: K Mohan
//@Date: 18oct22

//importing the util class
import java.util.*;

//Declaring a class
class Ascii{
	//Main method
	public static void main(String[] args){
		
		//Creating Scanner object
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the character");
		//Taking the character input
		char charValue=sc.next().charAt(0);
		
		//Converting char to Ascii Value
		int AsciiValue= charValue;
		
		//Printing Ascii value
		System.out.println("The Ascii value of "+charValue+ " is: "+AsciiValue);
		
	}
	//end of main
}
//end of class Ascii