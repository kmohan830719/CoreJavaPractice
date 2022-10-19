//Program: to check if a number is positive or not
//@Author: K Mohan
//@Date: 18oct22

//importing packages
import java.util.*;

//Declaring a class
class PositiveNegative{
       //main method
	   public static void main(String[] args){
		 
        //creating Scanner object
        Scanner sc=new Scanner(System.in);
		
		//creating variables
        
         System.out.println("Enter the number");
         int num=sc.nextInt();	
	

         if(num>=0)
             System.out.println("It is a positive number");
         else
			 System.out.println("It is a negative number"); 
		 
		
	   }
	   //end of main
}
//end of class PositiveNegative