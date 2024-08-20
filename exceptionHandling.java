import java.io.*;
import java.util.Scanner;

public class exceptionHandling {
    public static void checkNum(int num) {
        if(num>=100) {
            throw new RuntimeException("Invalid marks");
        }
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nu1mber: ");
        int n = sc.nextInt();

        try {
            checkNum(n);
        }
        catch(Exception e) {
            System.out.println("Exception caught");
        }

        finally {
            System.out.println("Execution completes");
        }
    }
}
