//Program to find the average of three numbers using command line argument
//@Name: K Mohan
//@Date: 14oct22

//declaring the class
class Average
{
	// main method
	public static void main(String args[])
	{
		
		// creating local variales
	float num1=Float.parseFloat(args[0]);
    float num2=Float.parseFloat(args[1]);
    float num3=Float.parseFloat(args[2]);

    float average=(num1+num2+num3)/3;
	
	//printing the result
    System.out.println("The average of the three numbers is: " +average);
	}
	//end of main
}	

//end of class Average