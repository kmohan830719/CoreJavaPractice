//Program: to print the grade according to the percentage
//@auther:K Mohan
//@Date: 19oct22

//importing the package
import java.util.*;

//Declaring the class
class GradingSystem{
	//main method
	public static void main(String[] args){
		
		//creating object of Scanner class
		Scanner sc=new Scanner(System.in);
		
		//declaring the variables
		System.out.println("Enter your percentage ");
		float percentage=sc.nextFloat();
		
		char grade;
		
		//checking percentage to calculate grade
		if(percentage>=85)
			grade='A';
		else if(percentage>=70)
			grade='B';
		else if(percentage>=65)
			grade='C';
        else if(percentage>=40)
			grade='D';
		else
			grade='F';
		//end of ifElse
		
		if(grade=='F')  //comparing
			System.out.println("Sorry!! tou have failed...");
		else
			System.out.println("Congrats!! you have passed the exam with grade: "+grade);
		
	}
	//end of main
}
//end of class GradingSystem
			
            		