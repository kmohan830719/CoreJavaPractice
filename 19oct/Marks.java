//Program: to check pass or fail using Scanner class
//@Auther: K Mohan
//@Date: 19oct22

//importing Scanner class
import java.util.*;

//Declaring the class
 class Marks{
	 //main method
	 public static void main(String[] args){
 
        //creating object of Scanner
        Scanner sc=new Scanner (System.in);
		
		//declaring variables and taking input
        System.out.println("Enter your physics marks");
        float physics=sc.nextFloat();
		
        System.out.println("Enter your maths marks");
        float maths=sc.nextFloat();
		
        System.out.println("Enter your english marks");
        float english=sc.nextFloat();

        //calculating percentage
        float percentage=((physics+maths+english)*100)/300;
		
		System.out.println("Your percentage is: "+percentage+" %");
		
		//checking whether pass or fail
        if(percentage>=40){
            System.out.println("Congats ,you are pass");
        }
        else{
            System.out.println("Sorry, you are failed");
        }
		
		
	 }
	 //emd of main
 }
 //end of class Marks