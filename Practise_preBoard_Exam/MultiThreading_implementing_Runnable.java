package Practise_preBoard_Exam;

class MyThread implements Runnable {
    public void run () {
        System.out.println("current running thread"+Thread.currentThread().getName());
    }
}

public class MultiThreading_implementing_Runnable {
    public static void main(String[] args) {
        MyThread obj = new MyThread();
        for(int i=0; i<9; i++) {
           Thread thread = new Thread(obj);
           thread.start();
        }
    }
}
