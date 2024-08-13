import java.util.Scanner;
public class user_input_in_float {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, div;
        System.out.println("Enter the value of a: ");
        a = sc.nextFloat();
        System.out.println("Enter the value of b: ");
        b = sc.nextFloat();
        div = a/b;
        System.out.println("The final value is: " +div);
    }
}
