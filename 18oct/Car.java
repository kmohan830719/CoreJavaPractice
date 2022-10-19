//Program: to understand instanceof operator
//@Author: K Mohan
//@Date: 18oct22

//Declaring a class
class Car{
       //main method
	   public static void main(String[] args){
		   
		  //Creating car object
		  Car Tata=new Car();
		  
		  // checking whether it is an instanceof
		  System.out.println(Tata instanceof Car);      //gives boolean result (true)
		  
		  Car Audi=null;
		  System.out.println(Audi instanceof Car);      //gives boolean result (false)
		
	   }
	   //end of main
}
//end of class Instanceof