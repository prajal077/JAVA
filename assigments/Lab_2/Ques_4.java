package assigments.Lab_2;
import java.io.*;
import java.util.Scanner;
//Custom_RuntimeException

class MyException extends RuntimeException {
    MyException (String msg) {
        super(msg);
    }
        }

public class Ques_4  {
    public static void CheckNum (int num) {
        if(num>100) {
            throw new MyException ("Invalid number");
        }
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        try {
            CheckNum (num);
        }

        catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
