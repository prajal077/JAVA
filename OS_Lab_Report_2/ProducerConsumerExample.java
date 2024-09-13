package OS_Lab_Report_2;

import java.util.concurrent.Semaphore;

class ProducerConsumer {
    static final int BUFFER_SIZE = 5;
    int[] buffer = new int[BUFFER_SIZE];
    int in = 0, out = 0;

    Semaphore empty = new Semaphore(BUFFER_SIZE);  // Track empty slots
    Semaphore full = new Semaphore(0);             // Track filled slots
    Semaphore mutex = new Semaphore(1);            // Mutex for critical section

    public void produce() throws InterruptedException {
        int item;
        for (int i = 0; i < 10; i++) {
            item = i;
            empty.acquire();  // Wait if buffer is full
            mutex.acquire();  // Enter critical section

            buffer[in] = item;
            System.out.println("Producer produced: " + item);
            in = (in + 1) % BUFFER_SIZE;

            mutex.release();  // Exit critical section
            full.release();   // Increment the number of full slots
            Thread.sleep(1000);
        }
    }

    public void consume() throws InterruptedException {
        int item;
        while (true) {
            full.acquire();   // Wait if buffer is empty
            mutex.acquire();  // Enter critical section

            item = buffer[out];
            System.out.println("Consumer consumed: " + item);
            out = (out + 1) % BUFFER_SIZE;

            mutex.release();  // Exit critical section
            empty.release();  // Increment the number of empty slots
            Thread.sleep(2000);
        }
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();

        // Create Producer thread
        Thread producerThread = new Thread(() -> {
            try {
                pc.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Create Consumer thread
        Thread consumerThread = new Thread(() -> {
            try {
                pc.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}

