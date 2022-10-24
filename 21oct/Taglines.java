//Program: to print tag lines of different companies
//@Auther: K Mohan
//@Date:21oct22

// importing package
import java.util.*;

//declaring class
 class Taglines{
	 //main method
    public static void main(String[] args) {
		
		//creating object of scanner class
        Scanner sc=new Scanner (System.in);
		
		//taking input
	    System.out.println("Enter the company name");
        String companyName=sc.next().toUpperCase();
	   
	     //calling the method
		 langType(companyName);
	}
	//end of amin method
	
    //method to print taglines of the company    
    static void langType(String inp){    
		//switch case
        switch (inp){
          case "TCS" -> System.out.println("Bulding on Belief");
		  case "WIPRO"-> System.out.println("Spirit of wipro");
	      case "ACCENTURE"-> System.out.println("Ideate,innovate,change the world,repeat");
		  case "INFOSYS"-> System.out.println("Navigate your Next");
	      default ->  System.out.println("not a valid input");
        }
   
	
    }
	  //end of method langType
	
	
}
//end of class Taglines