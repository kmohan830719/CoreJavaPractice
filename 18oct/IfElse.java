//Program: to understand ifelse statement
//@Author: K Mohan
//@Date: 18oct22

//importing packages
import java.util.*;

//Declaring a class
class IfElse{
       //main method
	   public static void main(String[] args){
		 
        //creating Scanner object
        Scanner sc=new Scanner(System.in);
		
		//creating variables
        
         System.out.println("Enter the first number");
         int num1=sc.nextInt();	

         System.out.println("Enter the second number");
         int num2=sc.nextInt();	

         if(num1>num2)
             System.out.println("The greater number is: "+num1);
         else
			 System.out.println("The greater number is: "+num2); 
		 
		
	   }
	   //end of main
}
//end of class IfElse