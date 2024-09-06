package assigments.Lab_4;

//WAP to list 5 names and sort them by using inbuilt function and without using inbuilt function

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ques_3 {
    public static void main(String [] agrs) {
        ArrayList<String>name1 = new ArrayList<>();
        ArrayList<String>name2 = new ArrayList<>();

        name1.add("prajal");
        name1.add("sandip");
        name1.add("bigyan");
        name1.add("sandesh");
        name1.add("dinesh");

        Collections.sort(name1);
        System.out.println("The sorted naems are: "+name1);
    }
}
