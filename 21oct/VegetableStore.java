//Program: to make vegitable store and generate bill
//@Auther: K Mohan
//@Date:21oct22

// importing package
import java.util.*;

//declaring class
 class VegetableStore{
	 
	 //method to present menu and take user choice
     static void menuItems() {
		//creating object of scanner class
        Scanner sc=new Scanner (System.in);
		//taking input
        System.out.println("The available items to buy");
        System.out.println("1.Carrot: 100/kg");
        System.out.println("2.Potato: 30/kg");
        System.out.println("3.Tomato: 50/kg");
        System.out.println("4.Brinjal: 40/kg");
		System.out.println("5.Peas: 45/kg");
         
		//taking the choice of user
        System.out.println("Enter what you want to buy");
        int choice=sc.nextInt();
        float total=0.0f,quantity=0.0f;
        
		//switch case
        switch (choice){
            case 1:  System.out.println("Enter the quantity ");
                     quantity=sc.nextInt();
					 total=quantity*100;
                break;
            case 2:  System.out.println("Enter the quantity ");
                      quantity=sc.nextInt();
					    total=quantity*30;
                break;
            case 3:  System.out.println("Enter the quantity ");
                      quantity=sc.nextInt();
					    total=quantity*50;
                break;
            case 4:  System.out.println("Enter the quantity ");
                      quantity=sc.nextInt();
					    total=quantity*40;
                break;
		    case 5: System.out.println("Enter the quantity ");
                     quantity=sc.nextInt();
					 total=quantity*45;
                break;
            default:
                System.out.println("Invalid input");
        }
		
     //calling the method
	 calbill(total);
    }
	 //end of method menuItems
	  
	 //method to calculate price
    static void calbill( float cal){
		
		//if else ladder
        if(cal>=2000){
            float newbill=(20*cal)/100;
			 System.out.println("The discount offerd is: "+newbill);
            System.out.println("The bill you have to pay is: "+(cal-newbill));
        }
		else if(cal>=1000 && cal<2000){
            float newbill=(10*cal)/100;
			 System.out.println("The discount offerd is: "+newbill);
            System.out.println("The bill you have to pay is: "+(cal-newbill));
        }
		else if(cal>=200 && cal<1000){
            float newbill=(5*cal)/100;
			 System.out.println("The discount offerd is: "+newbill);
            System.out.println("The bill you have to pay is: "+(cal-newbill));
        }	
        else{
            System.out.println("The toatl bill without discout is: "+cal);
        }
    }
	//end of method calbill
	
	//main method
	public static void main(String[] args) {
		
		menuItems();                  //calling method to present menu
	}
	//end of main method
}
//end of class VegetableStore
