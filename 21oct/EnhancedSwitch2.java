//Program: to implement enhanced switch case
//@Auther: K Mohan
//@Date:21oct22

// importing package
import java.util.*;

//declaring class
 class EnhancedSwitch2{
	 //main method
    public static void main(String[] args) {
		
		//creating object of scanner class
        Scanner sc=new Scanner (System.in);
		
		//taking input
	   System.out.println("Enter the language");
       String languages=sc.next().toLowerCase();
	   
	     //calling the method
		 langType(languages);
	}
	
     //method to apply enhanced switchcase  
    static void langType(String inp){ 
	
		//switch case
          switch (inp){
           case "c","java","c++",".net" -> System.out.println("Programing languages");
		      case "sql","oracle"-> System.out.println("DBMS language");
			     case "html","paython","javascript"-> System.out.println("Web based languages");
				 default ->  System.out.println("not a valid input");
        }
   
	
    }
	  //end of main
	
	
}
//end of class EnhancedSwitch2
