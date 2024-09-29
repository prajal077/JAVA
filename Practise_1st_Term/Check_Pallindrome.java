package Practise_1st_Term;

import java.util.*;

public class Check_Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int org = num;
        int rev=0;

        while (num!=0) {
            int rem = num%10;
            rev = rev*10+rem;
            num = num/10;
        }

        if (rev==org) {
            System.out.println("It is palindrome");
        }
        else {
            System.out.println("It is not palindrome");
        }
    }
}
