class MYthread implements Runnable {
    public void run () {
        System.out.println("Running thread: "+Thread.currentThread().getName());
    }
}

public class multithreading_with_runnable_interface {
    public static void main (String [] args) {
        MYthread objjj = new MYthread();
        for (int i = 0; i<10; i++) {
            Thread thread = new Thread(objjj);
            thread.start();
        }
    }
}
