//Program: to check voting eligiblity
//@Author: K Mohan
//@Date: 18oct22

//importing packages
import java.util.*;

//Declaring a class
class Vote{
       //main method
	   public static void main(String[] args){
		 
        //creating Scanner object
        Scanner sc=new Scanner(System.in);
		
		//creating variables
        
         System.out.println("Enter your age");
         int age=sc.nextInt();	

       
         if(age>=18)
             System.out.println("You are eligible to vote");
         else
			 System.out.println("YOu are not eligible to vote"); 
		 
		
	   }
	   //end of main
}
//end of class Vote