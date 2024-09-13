package OS_Lab_Report_2;

//Implementation of semaphore on process synchronization.-------QUESTION 1
import java.util.concurrent.Semaphore;

class Task implements Runnable {
    private Semaphore semaphore;
    private int id;

    public Task(Semaphore semaphore, int id) {
        this.semaphore = semaphore;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();  // Wait (P) operation
            System.out.println("Thread " + id + " is in the critical section.");
            // Critical section
            System.out.println("Thread " + id + " is leaving the critical section.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();  // Signal (V) operation
        }
    }
}

public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);  // Binary semaphore
        Thread t1 = new Thread(new Task(semaphore, 1));
        Thread t2 = new Thread(new Task(semaphore, 2));

        t1.start();
        t2.start();
    }
}