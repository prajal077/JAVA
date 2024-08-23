import java.util.*;

public class listDemo2 {
    public static void main(String [] args) {
        List<String> listObj = new ArrayList<>();
        listObj.add("prajal");
        listObj.add("is");
        listObj.add("good");

        System.out.println("The size of list is: "+listObj.size());
        System.out.println("Is list empty? "+listObj.isEmpty());
        System.out.println("Does this list contains word PRAJAL? "+listObj.contains("prajal"));

        for (int i = 0; i<listObj.size(); i++) {
            System.out.println(listObj.get(i));
        }
    }
}
