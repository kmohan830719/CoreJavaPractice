//Program: to print the number of days in a month
//@Auther: K Mohan
//@Date:21oct22

//importing package
import java.util.*;

//declaring class
 class MonthDays{
	 //main method
    public static void main(String[] args) {
		
		//creating object of scanner class
        Scanner sc=new Scanner (System.in);
		
		//taking input
	    System.out.println("Enter the name of the Month");
        String monthName=sc.next().toUpperCase();
	   
	     //calling the method
		 noOfDays(monthName);
	}
	//end of main method
	
    //method to print no of days in month    
    static void noOfDays(String inp){ 

         //creating object of scanner class
        Scanner sc=new Scanner (System.in);
		
		//switch case 
        switch (inp){
          case "JANUARY":
          case "MARCH":
		  case "MAY":
		  case "JULY":
		  case "AUGUST":
		  case "OCTOBER":
		  case "DECEMBER":System.out.println("The number of days in "+inp+" is 31");
	      break;
        
	
			case "APRIL":
			case "JUNE":
			case "SEPTEMBER":
			case "NOVEMBER":System.out.println("The nunmber of days in "+inp+" is 30");
			break;
      
	                        //condition to check the leap year
			case "FEBRUARY" : System.out.println("Enter the year");
			                  int year=sc.nextInt();
							  if((year%4)==0 && (year%100)!=0 || (year%400)==0 )
								 System.out.println("The number of days in February is 29");
                              else	 System.out.println("The number of days in February is 28");
                              break;
							  default :  System.out.println("not a valid input");
		}							  
	
    }
	  //end of method noOfDays
	
	
}
//end of class MonthDays