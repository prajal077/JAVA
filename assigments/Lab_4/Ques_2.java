package assigments.Lab_4;

//WAP to take a word as a input and check if it is palindrome or not

import java.util.Scanner;

public class Ques_2 {
    public static void main(String [] agrs) {
        Scanner sc = new Scanner(System.in);
        String rev = "";
        System.out.println("Enter a string: ");
        String string = sc.nextLine();

        for(int i = string.length()-1; i>=0; i--) {
            rev = rev+string.charAt(i);
        }

        if(rev.equals(string)) {
            System.out.println("It is palindrome");
        }
        else {
            System.out.println("It is not palindrome");
        }
    }
}
