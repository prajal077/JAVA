import java.util.*;

  public class Car {
      int year;
      String model;
      String color;
      boolean electric;

      Car(int a, String b, String c, boolean d) {
          year = a;
          model = b;
          color = c;
          electric = d;

          System.out.println("The built year is: " + year);
          System.out.println("The model is: " + model);
          System.out.println("The color is: " + color);
          System.out.println("Is car electric?: " + electric);
      }

      public static void main (String... args) {
          Scanner sc = new Scanner(System.in);

          System.out.println("Enter the year built: ");
          int a = sc.nextInt();
          sc.nextLine();  //consume the newline character
          System.out.println("Enter the car model: ");
          String b = sc.nextLine();
          System.out.println("Enter the car color: ");
          String c = sc.nextLine();
          System.out.println("Is car electric?: ");
          boolean d = sc.nextBoolean();

          Car obj = new Car(a, b, c, d);
      }
  }
