package Final_Practise;

import java.util.Scanner;

interface A {
     void sumAndAverage ();
}

class Calculate implements A {
    Scanner sc = new Scanner(System.in);
    public void sumAndAverage () {
        System.out.println("Enter how many number you wants in your array: ");
        int N = sc.nextInt();
        int[] num = new int[N];

        System.out.println("Enter the numbers: ");
        for (int i=0; i<N; i++) {
            num[i] = sc.nextInt();
        }

        int sum = 0;

        for(int i=0; i<N; i++) {
            sum+=num[i];
        }

        System.out.println("The sum is: "+sum);


        float average = sum/N;
        System.out.println("The average of that number is: "+average);
    }
}

public class Interface_implementation {
    public static void main(String[] args) {

        Calculate c = new Calculate();
        c.sumAndAverage();
    }
}
