import java.util.Scanner;
public class user_inputs_2 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int number = 0;
        System.out.println("Enter the name: ");
        name = sc.nextLine();
        System.out.println("Enter the Number");
        number = sc.nextInt();
        System.out.println("The favourite number of " +name+ " is " +number);
    }
}
