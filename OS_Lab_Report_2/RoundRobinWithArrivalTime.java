package OS_Lab_Report_2;

import java.util.Scanner;

class Process {
    int id, arrivalTime, burstTime, remainingTime, waitingTime, turnaroundTime, completionTime;

    Process(int id, int arrivalTime, int burstTime) {
        this.id = id;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.waitingTime = 0;
        this.turnaroundTime = 0;
    }
}

public class RoundRobinWithArrivalTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of processes and time quantum
        System.out.print("Enter the number of processes: ");
        int n = sc.nextInt();

        System.out.print("Enter the time quantum: ");
        int timeQuantum = sc.nextInt();

        // Input arrival time and burst time for each process
        Process[] processes = new Process[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter arrival time for process " + (i + 1) + ": ");
            int arrivalTime = sc.nextInt();
            System.out.print("Enter burst time for process " + (i + 1) + ": ");
            int burstTime = sc.nextInt();
            processes[i] = new Process(i + 1, arrivalTime, burstTime);
        }

        // Implementing Round Robin Scheduling
        int time = 0; // Current time
        int completed = 0; // Count of completed processes
        boolean done;
        float totalWT = 0, totalTAT = 0;

        do {
            done = true;
            for (int i = 0; i < n; i++) {
                // Check if process has arrived and has remaining burst time
                if (processes[i].remainingTime > 0 && processes[i].arrivalTime <= time) {
                    done = false;
                    if (processes[i].remainingTime > timeQuantum) {
                        time += timeQuantum;
                        processes[i].remainingTime -= timeQuantum;
                    } else {
                        time += processes[i].remainingTime;
                        processes[i].completionTime = time;
                        processes[i].remainingTime = 0;
                        processes[i].turnaroundTime = processes[i].completionTime - processes[i].arrivalTime;
                        processes[i].waitingTime = processes[i].turnaroundTime - processes[i].burstTime;
                        totalWT += processes[i].waitingTime;
                        totalTAT += processes[i].turnaroundTime;
                        completed++;
                    }
                }
            }
        } while (completed != n);

        // Displaying results
        System.out.println("\nProcess\tArrival Time\tBurst Time\tWaiting Time\tTurnaround Time");
        for (int i = 0; i < n; i++) {
            System.out.println("P" + processes[i].id + "\t" + processes[i].arrivalTime + "\t\t" + processes[i].burstTime +
                    "\t\t" + processes[i].waitingTime + "\t\t" + processes[i].turnaroundTime);
        }

        // Calculate and display Average Waiting Time and Average Turnaround Time
        float avgWT = totalWT / n;
        float avgTAT = totalTAT / n;
        System.out.println("\nAverage Waiting Time: " + avgWT);
        System.out.println("Average Turnaround Time: " + avgTAT);

        sc.close();
    }
}


