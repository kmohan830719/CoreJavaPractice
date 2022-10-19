//Program: WAP to print the report card
//@Auther:K Mohan
//@Date: 19oct22

//imopting package
import java.util.*;

//Declaring the class
class ReportCard{
	//main method
	public static void main(String[] args){
		
		//creating the object of Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking user input
		System.out.println("Enter the marks of subject1");
		float sub1=sc.nextFloat();
		System.out.println("Enter the marks of subject2");
		float sub2=sc.nextFloat();
		System.out.println("Enter the marks of subject3");
		float sub3=sc.nextFloat();
		
		
		//calling method to print percentage
		calPercentage(sub1,sub2,sub3);
		
		
	}
	//end of main
	
	//cretaing method to calculate the percentage
	static void calPercentage(float m1,float m2,float m3){
		
		//calculating the percentage
		float per=((m1+m2+m3)/300)*100;
		System.out.println("The total percentage you secured is: "+per);
		
		//calling method to print grade
		assignGrade(per);
	}
	//end of method calPercentage
	
	//method to assign grades according to percentage
	static void assignGrade(float per){
		
		char grade;
		//checking percentage to calculate grade
		if(per>=85)
			grade='A';
		else if(per>=70)
			grade='B';
		else if(per>=60)
			grade='C';
		else if(per>=45)
			grade='D';
		else
			grade='F';
		
		if(grade=='F')   System.out.println("Your grade is:"+grade);
		else             System.out.println("Your grade is: "+grade);
		
		//calling method to print remarks
		remarks(grade);
		
	}
	//end of method assignGrade
	
	//method to print remarks
	static void remarks(char grade){
		
		//switch case
		switch(grade){
			case 'A': System.out.println("Excellent performance....");
			break;
			case 'B': System.out.println("Very good...you performed well");
			break;
			case 'C': System.out.println("Good...needs to improve");
			break;
			case 'D': System.out.println("fair...you need to do hard work");
			break;
			case 'F': System.out.println("Sorry...you are failed");
			break;
			default: System.out.println("Invalid input");
		}
			
	}
   //end of method remarks
}
//end of Class ReportCard