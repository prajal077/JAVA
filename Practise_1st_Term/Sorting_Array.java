package Practise_1st_Term;
import java.util.*;
public class Sorting_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to sort: ");
        int n = sc.nextInt();
        int [] array = new int[n];
        System.out.println("Enter the numbers: ");
        for (int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }

        for (int i=0; i<n;i++) {
            for (int j = i+1; j<n; j++) {
                if(array[i]>array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("The sorted array in ascending order is: ");
        for (int i=0; i<n;i++) {
            System.out.println(array[i]);
        }
    }
}
