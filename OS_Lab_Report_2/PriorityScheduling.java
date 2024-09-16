package OS_Lab_Report_2;

import java.util.Scanner;
import java.util.Arrays;

class Taskss {
    int id, arrivalTime, burstTime, priority, waitingTime, turnaroundTime;

    Taskss(int id, int arrivalTime, int burstTime, int priority) {
        this.id = id;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.priority = priority;
    }
}

public class PriorityScheduling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of tasks: ");
        int n = sc.nextInt();

        Taskss[] tasks = new Taskss[n];

        // Input task details: arrival time, burst time, and priority
        for (int i = 0; i < n; i++) {
            System.out.print("Enter arrival time, burst time, and priority for task " + (i + 1) + ": ");
            tasks[i] = new Taskss(i + 1, sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        // Sort tasks by priority (lower number = higher priority) and then by arrival time
        Arrays.sort(tasks, (t1, t2) -> t1.priority == t2.priority ?
                t1.arrivalTime - t2.arrivalTime : t1.priority - t2.priority);

        int time = 0;
        float totalWT = 0, totalTAT = 0;

        System.out.println("\nTask\tArrival Time\tBurst Time\tPriority\tWaiting Time\tTurnaround Time");

        for (Taskss t : tasks) {
            if (time < t.arrivalTime) time = t.arrivalTime; // CPU waits if no task arrives

            t.waitingTime = time - t.arrivalTime;
            t.turnaroundTime = t.waitingTime + t.burstTime;
            time += t.burstTime;

            totalWT += t.waitingTime;
            totalTAT += t.turnaroundTime;

            System.out.println("T" + t.id + "\t" + t.arrivalTime + "\t\t" + t.burstTime + "\t\t" + t.priority +
                    "\t\t" + t.waitingTime + "\t\t" + t.turnaroundTime);
        }

        // Calculate and display average waiting time and average turnaround time
        System.out.println("\nAverage Waiting Time: " + totalWT / n);
        System.out.println("Average Turnaround Time: " + totalTAT / n);

        sc.close();
    }
}

