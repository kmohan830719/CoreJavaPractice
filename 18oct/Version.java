//Proram to print the System Properties
//@Author: K Mohan
//@Date: 180ct22

//Declaring the class
class Version{
	
	//Main method
	public static void main(String[] args){
		
		//Printing the properties
		System.out.println("The version of java is "+System.getProperty("java.version"));
	    System.out.println("The installation directory is: "+System.getProperty("java.home"));
	}
	//end of main
}
//end of class Version