import java.util.*;
public class sorting_array {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter how many number you want in your array: ");
        n = sc.nextInt();
        int [] nums = new int[n];
        System.out.println("Enter number: ");
        for(int i=0; i<n; i++) {
           nums[i] = sc.nextInt();
        }

        //Ascending order

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(nums[i]>nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for(int i=0; i<n; i++) {
            System.out.println(nums[i]);
        }
    }
}
