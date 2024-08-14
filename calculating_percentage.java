import java.util.Scanner;
public class calculating_percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float math, science, health, english, social, sum;

        System.out.println("Enter the marks in science: ");
        science = sc.nextFloat();
        System.out.println("Enter the marks in math: ");
        math = sc.nextFloat();
        System.out.println("Enter the marks in english: ");
        english = sc.nextFloat();
        System.out.println("Enter the marks in health: ");
        health = sc.nextFloat();
        System.out.println("Enter the marks in social: ");
        social = sc.nextFloat();

        sum = math+social+english+health+science;
        int total = 500;
        float percentage = (sum/total) * 100;

        System.out.println("The total percentage of a individual is: " +percentage);
    }
}
