//Program: to give grace marks to the students
//@Auther: K Mohan
//@Date:19oct22

// importing package
import java.util.*;

//declaring the class
 class GraceMarks {
     //main method
    public static void main(String[] args) {
        
        //creating object of scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you marks");
        
        //taking input from user
        float marks=sc.nextFloat();
        
        //calling the method
        grace(marks);
    }
    //end of main
    
    //method to give grace marks
    static void grace(float n1){
        float newMarks=n1;
        if(n1>35 && n1<=37){          //giving grace marks
            newMarks=newMarks+5;
            System.out.println("your new marks are: "+newMarks);
        }
        else if(n1>37 && n1<40){
            newMarks=newMarks+2;
            System.out.println("your new marks are: "+newMarks);
        }
        else{
            System.out.println("no grace marks for you");
        }
    }
    //end of method grace
}
//end of class GraceMarks
