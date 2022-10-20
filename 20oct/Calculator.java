//Program: to make a calculator
//@Auther: K Mohan
//@Date:19oct22

//importing the package
import java.util.*;

//declaring the class
class Calculator{
	//main method
	   public static void main(String[] args) {
		   
		//creating object of Scanner
        Scanner sc = new Scanner(System.in);
		//tking input
        System.out.println("Enter first number");
        float num1=sc.nextFloat();
        System.out.println("Enter second number");
        float num2=sc.nextFloat();
		
        // choice menu
        System.out.println("1: addition");
        System.out.println("2: subtraction");
        System.out.println("3: multiplication");
        System.out.println("4: division");
        System.out.println("5: exit");

        // taking the choice
        System.out.println("Enter your choice");
        int choice=sc.nextInt();

        //switch case
        switch(choice){
            case 1: add(num1 ,num2);
                break;
            case 2: sub(num1 ,num2);
                break;
            case 3: multi(num1 ,num2);
                break;
            case 4: div(num1 ,num2);
                break;
            case 5: System.exit(0);
                break;
            default:
                System.out.println("invalid input");
		}
		
     }
   //end of main
   
    // method for addition
     static void add(float n1, float n2) {
        float sum=(n1+n2);
         System.out.println("The sum is: "+sum);
    }
	//end of method add
	
	//method for multiplication
    static void multi(float n1, float n2) {
        float sum=(n1*n2);
        System.out.println("The product is: "+sum);
    }
	//end of method multi
	
	//method for division
    static void div(float n1, float n2) {
        float sum=(n1/n2);
        System.out.println("The quostient is: "+sum);
    }
	//end of method div
	
	//method for subtraction
    static void sub(float n1, float n2) {
        float sum=(n1-n2);
        System.out.println("The difference is: "+sum);
    }
	//end of method sub
 }
	//end of class Calculator
		