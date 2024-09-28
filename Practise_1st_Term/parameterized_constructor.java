package Practise_1st_Term;
import java.util.*;

 class Car {
     String name, color;
     int year;
     boolean electric;

     Car(String a, String b, int c, boolean d) {
         this.name = a;
         this.color = b;
         this.year = c;
         this.electric = d;

         System.out.println("The name of car is: "+name);
         System.out.println("The color of car is: "+color);
         System.out.println("The built year  of car is: "+year);
         System.out.println("is car electric?: "+electric);
     }
}

public class parameterized_constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the car: ");
        String a = sc.nextLine();
        System.out.println("Enter the color of the car: ");
        String b = sc.nextLine();
        System.out.println("Enter the built year of the car: ");
        int c = sc.nextInt();
        System.out.println("Enter whether the car is electric or not: ");
        boolean d = sc.nextBoolean();

        Car car = new Car (a,b,c,d);
    }
}
