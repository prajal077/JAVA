package Final_Practise;


import java.util.Scanner;

class CustomException extends Exception {
    CustomException (String msg) {
        super(msg);
    }
}

public class Custom_Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();

        try {
            checkAge(age);
        }catch (CustomException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Exception is checked.");
        }
    }

    public static void checkAge(int n) throws CustomException {
        if(n<18) {
            throw new CustomException("The age is invalid!!");
        }
        else {
            System.out.println("You can vote!");
        }
    }

}
