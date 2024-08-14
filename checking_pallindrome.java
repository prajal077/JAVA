import java.util.*;
public class checking_pallindrome {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number to check the palindrome: ");
        num = sc.nextInt();
        int original = num;
        int rev = 0;

        while(num!=0) {
            int rem = num%10;
            rev = rev * 10 + rem;
            num = num/10;
        }

        if(rev == original) {
            System.out.println("The given number is palindrome");
        }
        else {
            System.out.println("The given number is not palindrome");
        }
    }
}
