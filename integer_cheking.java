import java.util.Scanner;
public class integer_cheking {
    //checking whether thr entered number is integer or not
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean a;
        System.out.println("Enter the number to check: ");
        a = sc.hasNextInt();

        if(a == true) {
            System.out.println("The given number is an integer");
        }

        else {
            System.out.println("The given number is not an integer");
        }
    }
}
