package Practise_1st_Term;

class OddThread implements Runnable {
    public void run () {
        int i;
        for (i = 0;i<=100;i++){
            if (i % 2 == 1) {
                System.out.println("The odd numbers are: " + i);
            }
        }
    }
}

class EvenThread implements Runnable {
    public void run () {
        int i;
        for (i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("The even numbers are:" + i);
            }
        }
    }
}
public class MultiThreading {
    public static void main(String[] args) {
        OddThread obj1 = new OddThread();
        EvenThread obj2 = new EvenThread();

        Thread thread1 = new Thread(obj1);
        thread1.start();

        Thread thread2 = new Thread(obj2);
        thread2.start();
    }
}
