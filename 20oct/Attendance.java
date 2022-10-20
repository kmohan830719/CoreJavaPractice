//Program: to check the attendance of the student
//@Auther: K Mohan
//@Date:19oct22

// importing package
import java.util.*;

//declaring the class
class Attendance {
    //main method
    public static void main(String[] args) {

        //creating object of scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you Attendance out of 100");

        //taking input from user
        float num=sc.nextFloat();

        //calling the method
        checkAttendance(num);
    }
    //end of main

    //method to give grace marks
    static void checkAttendance(float n1){

        if(n1>=75 && n1<85){          //checking attendance
            System.out.println("your attendance is good");
        }
        else if(n1>=85 && n1<100){
            System.out.println("your attendance is very good");
        }
        else if(n1==100){
            System.out.println("your attendance is 100%..very good");
        }
        else{
            System.out.println("you have less attendance..hence you cant sit for exams");
        }
    }
    //end of method checkAttemdance
}
//end of class Attendance
