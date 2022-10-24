//Program: to understand variables
//@Auther: K Mohan
//@Date:21oct22

//Local variables: inside a method
//instance variabes: inside a class
//static variables: only one copy

//declaring class
 class VariablesDemo{
	 
	 int age; //instance avriable
	 static int year;  //static variable
	 
	 //main method
    public static void main(String[] args) {
	
	//static int m=90; it can not be made inside a class
	
	//System.out.println(age); //we cannot call a non static variable from static method (compilation error)
	
	System.out.println(year);   //we can call a static from static 
    }
	  //end of main
	
}
//end of class VariablesDemo
