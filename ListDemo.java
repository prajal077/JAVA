import java.util.*;
public class ListDemo {
    public static void main (String [] args) {
        List <String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("ball");
        myList.add("cat");

        System.out.println("The size of list is: "+myList.size());
        System.out.println("isEmpty? :"+myList.isEmpty());
        System.out.println("The list contains apple? :"+myList.contains("apple"));
    }
}
