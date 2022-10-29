/*
 * to understand while loop
 * @Auther: K Mohan
 * @Date: 28oct22
 */

//importing the package
import java.util.*;

//declaring class
public class Example {

	// method to understand do while loop
	static void doWhile() {

		// creating object of Scanner class
		Scanner sc = new Scanner(System.in);

		boolean choice = true;
		// do while loop
		do {
			System.out.println("Enter a fruit");
			String fruit = sc.next();
			System.out.println("do you want to print more(true/false)");
			choice = sc.nextBoolean();
		} while (choice);
	}
	//end of method

	// main method
	public static void main(String[] args) {

		// while loop to first n numbers
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		// creating object of Scanner class
		Scanner sc=new Scanner(System.in);
		
		int choice=1;
		//while loop to print a set of action repitedly
		while(choice==1) {
			
			System.out.println("Enter a fruit");
			String fruit=sc.next();
			System.out.println("do you want to print more(1 for yes)");
			choice=sc.nextInt();
		}
		sc.close();

		// calling the method to print doWhile
		doWhile();

	}
	//end of main method
}
//end of class
