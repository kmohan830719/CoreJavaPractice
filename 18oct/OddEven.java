//Program: to check a number odd or even
//@Author: K Mohan
//@Date: 18oct22

//importing packages
import java.util.*;

//Declaring a class
class OddEven{
       //main method
	   public static void main(String[] args){
		 
        //creating Scanner object
        Scanner sc=new Scanner(System.in);
		
		//creating variables
        
         System.out.println("Enter the number");
         int num1=sc.nextInt();	

        
         if((num1%2)==0)
             System.out.println("The number is Even");
         else
			 System.out.println("The number is Odd"); 
		 
		
	   }
	   //end of main
}
//end of class OddEven