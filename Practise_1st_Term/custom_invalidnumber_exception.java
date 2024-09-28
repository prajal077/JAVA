package Practise_1st_Term;
import java.util.*;

class InvalidMarksException extends Exception {
    InvalidMarksException (String msg) {
        super(msg);
    }
}
public class custom_invalidnumber_exception {
    public static void checkNum (int numm) throws InvalidMarksException {
     if(numm>100) {
         throw new InvalidMarksException("invalid number");
     }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the number: ");
            int n = sc.nextInt();

            checkNum(n);
        }catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
        }
    }
}
