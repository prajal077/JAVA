package OS_Lab_Report_2;

import java.util.Scanner;

public class FCFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of processes: ");
        int n = sc.nextInt();

        int[] arrivalTime = new int[n];
        int[] burstTime = new int[n];
        int[] waitingTime = new int[n];
        int[] turnAroundTime = new int[n];
        int[] startTime = new int[n];
        int totalWaitingTime = 0, totalTurnaroundTime = 0;

        System.out.println("Enter arrival time and burst time for each process:");
        for (int i = 0; i < n; i++) {
            System.out.print("Process " + (i + 1) + " - Arrival time: ");
            arrivalTime[i] = sc.nextInt();
            System.out.print("Process " + (i + 1) + " - Burst time: ");
            burstTime[i] = sc.nextInt();
        }

        // FCFS Scheduling
        startTime[0] = arrivalTime[0];
        waitingTime[0] = 0;

        for (int i = 1; i < n; i++) {
            startTime[i] = startTime[i - 1] + burstTime[i - 1];
            waitingTime[i] = startTime[i] - arrivalTime[i];

            // If process arrives after the previous process finishes
            if (waitingTime[i] < 0) {
                waitingTime[i] = 0;
                startTime[i] = arrivalTime[i];
            }
        }

        // Calculate turnaround time for each process
        for (int i = 0; i < n; i++) {
            turnAroundTime[i] = waitingTime[i] + burstTime[i];
            totalWaitingTime += waitingTime[i];
            totalTurnaroundTime += turnAroundTime[i];
        }

        // Display the results
        System.out.println("\nProcess\tArrival Time\tBurst Time\tWaiting Time\tTurnaround Time");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t\t" + arrivalTime[i] + "\t\t" + burstTime[i] + "\t\t" + waitingTime[i] + "\t\t" + turnAroundTime[i]);
        }

        System.out.printf("\nAverage Waiting Time: %.2f", (float) totalWaitingTime / n);
        System.out.printf("\nAverage Turnaround Time: %.2f\n", (float) totalTurnaroundTime / n);

        sc.close();
    }
}

