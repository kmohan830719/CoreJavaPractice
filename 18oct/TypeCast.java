//Program: To understan Type casting
//@Auther: K Mohan
//@Date: 18oct22

//Declaring a class
class TypeCast{
	
	//main method
     public static void main(String[] args){
	 
	//short is of 2 bytes -32768 to 32767
         short s1=45;
     	 short s2= 90;
		 
		 //calculating the sum
		 short sum;             //by default all arithmatic operations gives int value
		
		 sum=(short)(s1+s2);    //type casting integer value to short
		 System.out.println("The sum is: "+ sum);
		 
		 
		 //byte -128 to 127
		  byte b1=56;
		  byte b2=72;
		  byte add=(byte)(b1+b2);     // if the sum is out of byte range(-128 to127) it will print the stating negative value
		  System.out.println("The sum is: "+ add);
		  
		 //double is of 9 bytes
		 double d1=45.66;
		 double d2=56.54;
		 float cal=(float)(d1+d2);    // type casting double to float
		 System.out.println("The sum is: "+ cal);
		 
		 
		 //to omit type casting
		 float f1=2.3f;
		 float f2=23.4f;
		 
		 f1+=f2;      // auto type casting integer value to float  (f1=f1+f2)
		 System.out.println("The sum is: "+ f1);
		 
	 }
	 //end of main
}
//end of class TypeCast
