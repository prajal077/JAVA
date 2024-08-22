import java.io.*;
import java.util.Scanner;

public class stringExample {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        //upper case
        String up = name.toUpperCase();
        System.out.println("The name in uppercase is: "+up);

        //lowercase
        String lc = name.toLowerCase();
        System.out.println("The name in lowercase is: "+lc);

        //length
        System.out.println("The lenght of a name is: "+name.length());
    }
}
