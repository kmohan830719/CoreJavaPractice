//Program: to check pass or fail using commandline arguments
//@Auther: K Mohan
//@Date: 19oct22

//Declaring the class
 class MarksArgs{
	 //main method
	 public static void main(String[] args){
 
         //taking input using command args
        float physics=Float.parseFloat(args[0]);
		System.out.println(" your physics marks: "+physics);
		
       
        float maths=Float.parseFloat(args[1]);
		System.out.println(" your maths marks: "+maths);
		
     
        float english=Float.parseFloat(args[2]);
		System.out.println(" your english marks: "+english);

        //Calculating percentage
        float percentage=((physics+maths+english)*100)/300;
		
		System.out.println("Your percentage is: "+percentage+" %");
		
        if(percentage>=40){
            System.out.println("Congats!! you are pass");
        }
        else{
            System.out.println("Sorry!! you are failed");
        }
		
		//end of ifElse
	 }
 //end of main
 }
 //end of class MarksArgs