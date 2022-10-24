//Program: to understand variables
//@Auther: K Mohan
//@Date:21oct22

//Local variables: inside a method
//instance variabes: inside a class
//static variables: only one copy

//declaring class
 class Variables{
	 
	 int age; //instance avriable
	 static int year;  //static variable
	 String name;
	 
	 //assigning default values
	// int =0, float=0.0f,double=0.0,String=null
	 
	 //main method
    public static void main(String[] args) {
	
	//static int m=90; it can not be made insede a class
	
	//System.out.println(age); //we cannot call a non static variable from static method (compilation error)
	
	System.out.println(year);   //we can call a static from static 
	

    // to call non static variables we need to make objects	
	Variables v1=new Variables();
	System.out.println(v1.age);
	System.out.println(v1.name); 

    int local;      
	//System.out.println(local); 	 has t be initialised
    }
	  //end of main
	
}
//end of class Variables