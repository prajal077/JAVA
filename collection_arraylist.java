import java.util.ArrayList;

public class collection_arraylist {
    public static void main(String [] args) {
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=1; i<=5; i++) {  //appending new elements at the end of list
            al.add(i);
        }
        System.out.println(al);

        al.remove(3); //removing element of index 3
        System.out.println("After removing: "+al);

        for(int i=0; i<al.size(); i++) {
            System.out.println(al.get(i) + " ");
        }
    }
}
