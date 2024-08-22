import java.io.*;
import java.util.Scanner;

public class sentenceWord {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to count the words:: ");
        String sen = sc.nextLine();

        String [] str = sen.split(" ");
        System.out.println("The number of words is: "+str.length);
    }
}
