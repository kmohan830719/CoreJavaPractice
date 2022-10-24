//Program: to implement enhanced switch case
//@Auther: K Mohan
//@Date:21oct22

// importing package
import java.util.*;

//declaring class
 class EnhancedSwitch{
	 //main method
    public static void main(String[] args) {
		//creating object of scanner class
        Scanner sc=new Scanner (System.in);
		//taking input
       String inputAbbr=sc.next().toLowerCase();
	   
	     //calling the method
		 abbreviatin(inputAbbr);
	}
	//end of main method
	
    //method to apply enhanced switchcase    
    static void abbreviatin(String inp){    
		//switch case
        switch (inp){
           case "lol"-> System.out.println("laugh out loud");
		      case "ttyl"-> System.out.println("Talk to you Later");
			     case "asap"-> System.out.println("As soon as possible");
				 default ->  System.out.println("not a valid input");
        }
   
	
    }
	  //end of method abbriviation
	
	
}
//end of class EnhancedSwitch
