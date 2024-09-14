package OS_Lab_Report_2;

import java.util.Scanner;

public class SRTF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        int[] at = new int[n], bt = new int[n], rt = new int[n], wt = new int[n], tat = new int[n];
        int time = 0, completed = 0, min = Integer.MAX_VALUE, shortest = 0, finish_time;
        int total_wt = 0, total_tat = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Process " + (i + 1) + " Arrival and Burst time: ");
            at[i] = sc.nextInt();
            bt[i] = sc.nextInt();
            rt[i] = bt[i];
        }

        while (completed != n) {
            for (int i = 0; i < n; i++) {
                if (at[i] <= time && rt[i] < min && rt[i] > 0) {
                    min = rt[i];
                    shortest = i;
                }
            }

            rt[shortest]--;
            min = (rt[shortest] == 0) ? Integer.MAX_VALUE : rt[shortest];

            if (rt[shortest] == 0) {
                completed++;
                finish_time = time + 1;
                wt[shortest] = finish_time - at[shortest] - bt[shortest];
                if (wt[shortest] < 0) wt[shortest] = 0;
                tat[shortest] = finish_time - at[shortest];
                total_wt += wt[shortest];
                total_tat += tat[shortest];
            }
            time++;
        }

        System.out.println("\nProcess\tAT\tBT\tWT\tTAT");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t" + at[i] + "\t" + bt[i] + "\t" + wt[i] + "\t" + tat[i]);
        }

        System.out.printf("\nAvg WT: %.2f\nAvg TAT: %.2f\n", (float) total_wt / n, (float) total_tat / n);

        sc.close();
    }
}

