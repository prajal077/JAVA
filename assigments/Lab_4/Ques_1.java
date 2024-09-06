package assigments.Lab_4;

/*WAP to take input of 5 pets and their name as :
    animal_type : animal_name (eg: cat : kitty )
    store the user input in map where animal type is the key and animal name  is the value
 */

import java.util.HashMap;
import java.util.Scanner;

public class Ques_1 {
    public static void main(String [] agrs) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String>map = new HashMap<>();
        System.out.println("Enter the pets name in the format aninam_type : animal_name");
        for(int i =0; i<5; i++) {
            String name = sc.nextLine();
            String [] result = name.split(":");
            map.put(result[0], result[1]);
        }

        System.out.println(map);
    }
}
