package OS_Lab_Report_2;

import java.util.concurrent.Semaphore;

class Philosopher extends Thread {
    private int id;
    private Semaphore leftFork, rightFork;
    private static final int MEALS = 3;

    public Philosopher(int id, Semaphore leftFork, Semaphore rightFork) {
        this.id = id;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    public void run() {
        try {
            int meals = 0;
            while (meals < MEALS) {
                System.out.println("Philosopher " + id + " is thinking");
                sleep(1000);

                leftFork.acquire();
                rightFork.acquire();

                System.out.println("Philosopher " + id + " is eating (meal " + (meals + 1) + ")");
                sleep(2000);
                meals++;

                leftFork.release();
                rightFork.release();
            }

            System.out.println("Philosopher " + id + " has finished eating.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class DiningPhilosophers {
    public static void main(String[] args) {
        final int N = 5;
        Semaphore[] forks = new Semaphore[N];

        for (int i = 0; i < N; i++) {
            forks[i] = new Semaphore(1);
        }

        Philosopher[] philosophers = new Philosopher[N];
        for (int i = 0; i < N; i++) {
            philosophers[i] = new Philosopher(i, forks[i], forks[(i + 1) % N]);
            philosophers[i].start();
        }

        // Wait for all philosophers to finish eating
        for (int i = 0; i < N; i++) {
            try {
                philosophers[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

