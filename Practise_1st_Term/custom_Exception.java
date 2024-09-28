package Practise_1st_Term;
import java.util.*;
public class custom_Exception {
    public static void CheckNum (int number) throws Exception {
        if (number > 100) {
            throw new Exception("invalid number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        try {
            CheckNum(n);
        }catch (Exception e) {
            System.out.println("error found");
        }
    }
}
