//Program: To understan Bollean operators
//@Author: K Mohan
//@Date: 18oct22

//Declaring the class
class BooleanOperator{
	//Main method
	public static void main(String[] args){
		
		boolean x=true , y=false;
		System.out.println("And:"+ (x&y));   // if both are true
		System.out.println("OR:"+ (x|y));    // Either one is true
		System.out.println("Not:"+ (!y));    // prints opposite
		System.out.println("XOR:"+ (x^y));   // if both are same then false else true
		
		//Boolean operators on integers
		
		int a=4 , b=5;
		System.out.println("And:"+ (a&b));   //here int is converted into binary equivalent
		System.out.println("OR:"+ (a|b));   
		System.out.println("Not:"+ (~a));    // (~)not operator for integer, we cannot use(!) in integers
		System.out.println("XOR:"+ (a^b)); 
		
		System.out.println(a>=5 || b>=10);
		System.out.println(a>=5 && b>=10);
	}
	//end of main
}
//end of class BooleanOperator