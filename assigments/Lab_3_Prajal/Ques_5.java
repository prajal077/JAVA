package assigments.Lab_3_Prajal;

import java.util.HashSet;
import java.util.Set;
import java.util.*;

//WAP to take five names of student from the user and print them avoiding dublicate names

public class Ques_5 {
    public static void main(String [] args) {
        Set <String> names = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the five names of student: ");
        for(int i = 0; i<5; i++) {
            String name = sc.nextLine();
            if(!names.add(name)) {
                System.out.println("Duplicate name detected");
            }
        }

        System.out.println("Uniques names are: ");
        for (String name:names) {
            System.out.println(name);
        }
    }
}
