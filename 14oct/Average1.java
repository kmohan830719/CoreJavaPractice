//Program to find the average of three numbers using scanner class
//@Name: K Mohan
//@Date: 14oct22

//importing the Scanner class
import java.util.Scanner;

//declaring the class
class Average1
{
	//main method
	public static void main(String args[])
	{
		//creating object of Scanner class
		Scanner sc= new Scanner(System.in);
		
		//creating the variables
		
		System.out.println("Enter the first number");
		float num1=sc.nextFloat();
		System.out.println("Enter the Second number");
		float num2=sc.nextFloat();
		System.out.println("Enter the third number");
		float num3=sc.nextFloat();
		
		//calculating the average
		float average=(num1+num2+num3)/3;
		
		//printing the average
		System.out.println("The average of the three numbers is:"+average);
	}
	//end of main
}
//end of class Average1