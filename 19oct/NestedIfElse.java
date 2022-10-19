//Program: to understand nested ifElse statements
//@auther:K Mohan
//@Date: 19oct22

//importing the package
import java.util.*;

//Declaring the class
class NestedIfElse{
	//main method
	public static void main(String[] args){
		
		//creating object of Scanner class
		Scanner sc=new Scanner(System.in);
		
		//declaring the variables
		System.out.println("Enter your age ");
		int age=sc.nextInt();
		
	
		
	
		
		if(age>=18){
			System.out.println("Enter your gender (m/f) ");
				char gender=sc.next().charAt(0);
			System.out.println("Enter your weight ");
				float weight=sc.nextFloat();
			if((gender=='m')&&(weight>=60))
				System.out.println("You are eligible to donate the blood");
			else if((gender=='f')&&(weight>=50))
            System.out.println("you are eligible to donate blood ");
            		
		}
		else
			 System.out.println("you are not eligible to donate blood ");
		 
	}
}
		
	
     	
		