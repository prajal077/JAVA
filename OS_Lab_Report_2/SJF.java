package OS_Lab_Report_2;

import java.util.Scanner;
import java.util.Arrays;

public class SJF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        int[] at = new int[n], bt = new int[n], wt = new int[n], tat = new int[n];
        Integer[] p = new Integer[n];

        for (int i = 0; i < n; i++) {
            p[i] = i + 1;  // Process IDs
            System.out.print("Process " + (i + 1) + " Arrival and Burst time: ");
            at[i] = sc.nextInt();
            bt[i] = sc.nextInt();
        }

        // Sorting by burst time (SJF)
        Arrays.sort(p, (i, j) -> bt[i - 1] - bt[j - 1]);

        wt[0] = 0;
        for (int i = 1; i < n; i++) {
            wt[i] = wt[i - 1] + bt[p[i - 1] - 1] - (at[p[i] - 1] - at[p[i - 1] - 1]);
            if (wt[i] < 0) wt[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            tat[i] = wt[i] + bt[p[i] - 1];
        }

        System.out.println("\nProcess\tAT\tBT\tWT\tTAT");
        for (int i = 0; i < n; i++) {
            System.out.println(p[i] + "\t" + at[p[i] - 1] + "\t" + bt[p[i] - 1] + "\t" + wt[i] + "\t" + tat[i]);
        }

        System.out.printf("\nAvg WT: %.2f\nAvg TAT: %.2f\n", Arrays.stream(wt).average().orElse(0), Arrays.stream(tat).average().orElse(0));

        sc.close();
    }
}
