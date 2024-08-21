class EvenThread implements Runnable {
    public void run () {
        for (int i=0; i<10; i++) {
            if( i%2==0) {
            System.out.println(i);
            }
        }
    }
}

class OddThread implements Runnable {
    public void run () {
        for (int i = 0;  i<10; i++) {
             if(i % 2 ==1) {
            System.out.println(i);
            }
        }
    }
}
public class oddAndEvenThread {
    public static void  main (String [] args) {
        EvenThread obj0 = new EvenThread();
        OddThread obj1 = new OddThread();

        Thread thread1 = new Thread(obj0);
        thread1.start();
        Thread thread2 = new Thread(obj1);
        thread2.start();
    }
}
