//Program: to print the weeks using switchCase
//@Auther:K Mohan
//@Date: 19oct22

//imopting package
import java.util.*;

//Declaring the class
class SwitchCase{
	//main method
	public static void main(String[] args){
		
		//creating the object of Scanner
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		//Switch case
		switch(num){
			case 1: System.out.println("Monday");
			break;
			case 2: System.out.println("Tuesday");
			break;
			case 3: System.out.println("Wednesday");
			break;
			case 4: System.out.println("Thursday");
			break;
			case 5: System.out.println("Friday");
			break;
			case 6: System.out.println("Saturday");
			break;
			case 7: System.out.println("Sunday");
			break;
			default: System.out.println("Invalid input");
		}
		//end of switch case
	}
//end of main
}
//end of Class SwitchCase