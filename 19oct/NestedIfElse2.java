//Program: to check the greater number
//@auther:K Mohan
//@Date: 19oct22

//importing the package
import java.util.*;

//Declaring the class
class NestedIfElse2{
	//main method
	public static void main(String[] args){
		
		//creating object of Scanner class
		Scanner sc=new Scanner(System.in);
		
		//declaring the variables
		System.out.println("Enter number1 ");
		int num1=sc.nextInt();
		System.out.println("Enter number2 ");
		int num2=sc.nextInt();
		System.out.println("Enter number3 ");
		int num3=sc.nextInt();
		
		if((num1>num2)&&(num1>num3))
			System.out.println("the greatest number is: "+num1);
		else if(num2>num3)
			System.out.println("the greatest number is: "+num2);
		else
           System.out.println("the greatest number is: "+num3);	
	}
	//end of main
}	
//end if class NestedIfElse2
			
            		