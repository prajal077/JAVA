package Practise_1st_Term;

import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class HashSet_Example {
    public static void main(String[] args) {
        Set <String>names = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the names: ");
        for (int i=0; i<5; i++) {
            String name = sc.nextLine();
            if (!names.add(name)) {
                System.out.println("Duplicate name detected!!!");
            }
        }
        System.out.println("unique names are: ");
        for (String name:names) {
            System.out.println(name);
        }
    }
}
