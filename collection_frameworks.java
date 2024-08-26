import java.util.*;
import java.io.*;
import java.util.Hashtable;
import java.util.Vector;

//This collection uses arr[], vector, hashtable
public class collection_frameworks {
    public static void main(String [] args) {
        int arr[] = new int[] {1,2,3,4,5};
        Vector <Integer> v = new Vector<>();
        Hashtable<Integer, String> h = new Hashtable<>();

        v.addElement(1);  //adding elements in vector
        v.addElement(2);

        h.put(1, "prajal"); // adding elements in hashtable

        System.out.println(arr[0]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(1));
    }
}
