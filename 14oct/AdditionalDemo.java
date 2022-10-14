// program to understand commanline arguments
//@Name: K Mohan
//@Date: 140ct22

//creating the classs
class AdditionalDemo
{
	//main method
	public static void main(String args[])
	{
	//parsing string to integer
      int num1=Integer.parseInt(args[0]);

    //parsing string to float
      float num2=Float.parseFloat(args[1]);

    System.out.println("The sum of the numbers is :"+ (num1+num2) );
	}
	
	// end of main
}	
//end of the class AdditionalDemo