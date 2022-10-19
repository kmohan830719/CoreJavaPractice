// Program: to understan shift operators
//@Author: K Mohan
//@Date: 18oct22

//Declaring a class
class ShiftOperator{
       //main method
	   public static void main(String[] args){
		   
		   //right shift
		   int num1=4;
		   int shift=num1 >>1;      //direct formula for right shift (4/2^1)
		   System.out.println("The shifted value of num1 is: "+shift);
		   
		   //left shift
		   int num2=9;
		   System.out.println("The shifted value of num2 is: "+ (num2<<1));   // direct formula for left shift (9*2^1)
	   }
	   //end of main
}
//end of class ShiftOperator
