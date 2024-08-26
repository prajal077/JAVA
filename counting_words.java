import java.io.*;
import java.util.Scanner;

public class counting_words {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sen = sc.nextLine();

        String [] str = sen.split(" ");
        System.out.println(str.length);
    }
}
