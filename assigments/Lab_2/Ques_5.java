package assigments.Lab_2;
import java.io.*;
import java.util.Scanner;
//custom Checked Exception

class MyCheckedException extends Exception {
    MyCheckedException (String msg) {
        super(msg);
    }
}

public class Ques_5 {

    public static void CheckNun (int num) throws MyCheckedException{
        if(num>100) {
            throw new MyCheckedException("invalid numberrrrrr");
        }
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        try {
            CheckNun(num);
        }
        catch (MyCheckedException e) {
            System.out.println(e.getMessage());
        }
    }
}
