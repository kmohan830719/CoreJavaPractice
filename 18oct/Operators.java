//Program: To understand unary operators
//@Author: K Mohan
//@Date: 18oct22

//Declaring the class
class Operators{
	//main method
	public static void main(String[] args){
		
		int num1=12;
		System.out.println("The value of num1 is: "+ num1++);  //it will use the value first and then increments 
		
		int num2=num1++;
		System.out.println("The value of num2 is:"+num2);     //incremnted value will be printed here
	
		int num3=0;
		System.out.println("The negative value of 0 is: "+ ~num3); //(tilde ~)it will give the negative value of num3
		
		boolean status=true;
		System.out.println("!status: "+!status);   //(!) not operator will give opposite value
		
		// Decriment operator
		int num4=13;
		num4=num4--;  
		System.out.println("The value of num4 is "+num4); // it will use the value and then decriments
		
		int num5=13;
		num5=--num5;
		System.out.println("The value of num5 is "+num5);   //pre-decriment
		
		//Module operator
		int a=12,b=2;
		System.out.println("the Quotient is: "+ a/b);
		System.out.println("The remainder is: "+ a%b);   // it will print the remainder
		
	}
	//end of main
}
//end of class Operators