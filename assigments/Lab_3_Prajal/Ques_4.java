class MySharedResource {
    // Synchronized method to ensure only one thread accesses this at a time
    public synchronized void sayHello(String threadName) {
        System.out.println(threadName + " is saying hello...");
        try {
            // Simulating some work by making the thread sleep
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(threadName + " has finished saying hello.");
    }
}

public class Ques_4 {
    public static void main(String[] args) {
        // Shared resource for synchronization
        MySharedResource resource = new MySharedResource();

        // Creating three threads using Runnable without overriding
        Runnable task1 = new Runnable() {
            public void run() {
                resource.sayHello("Thread 1");
            }
        };

        Runnable task2 = new Runnable() {
            public void run() {
                resource.sayHello("Thread 2");
            }
        };

        Runnable task3 = new Runnable() {
            public void run() {
                resource.sayHello("Thread 3");
            }
        };

        // Starting the threads
        new Thread(task1).start();
        new Thread(task2).start();
        new Thread(task3).start();
    }
}
