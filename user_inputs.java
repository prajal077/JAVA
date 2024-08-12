import java.util.Scanner;
public class user_inputs {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        System.out.println("Enter the Number A: ");
        a = sc.nextInt(); //nextint scans the Interger
        System.out.println("Enter the Number B: ");
        b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of A and B is: ");
        System.out.println(sum);
    }
}
