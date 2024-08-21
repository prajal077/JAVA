class CustonThread extends Thread {
    public void run () {
        System.out.println("Running thread: "+Thread.currentThread().getName());
    }
}

public class multithreading_extending {
    public static void main(String [] args) {
         for (int i=0; i<10; i++) {
             CustonThread myThread = new CustonThread();
             myThread.start();
         }
    }
}
