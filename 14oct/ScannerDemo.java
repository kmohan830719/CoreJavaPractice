//program to understand the input using Scanner
//@auther: K Mohan
//@date: 14oct22

// importing util package for Scanner Class
import java.util.Scanner;

//declaring a class
class ScannerDemo {
	
	//main method
	public static void main(String args[])
	{
		//Creating object of Scanner class
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name=sc.nextLine();
		
		System.out.println("Enter your gender");
		char gender=sc.next().charAt(0);
		
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		System.out.println("Enter your marks");
		float marks=sc.nextFloat();
		
		System.out.println("Are you passed or not");
		boolean pass=sc.nextBoolean();
		
		
		//printing the result
		System.out.println(".....................................");
		System.out.println("Student details ");
		System.out.println("Name:"+ name);
		System.out.println("Gender:"+ gender);
		System.out.println("Age:"+ age);
		System.out.println("Marks:"+ marks);
		System.out.println("Pass:"+ pass);
		
	}
	//end of main
}
//end of the class ScannerDemo