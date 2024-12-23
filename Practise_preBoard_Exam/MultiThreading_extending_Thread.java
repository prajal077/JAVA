package Practise_preBoard_Exam;

class CustomThread extends Thread {
    public void run () {
        System.out.println("current running thread is: "+Thread.currentThread().getName());
    }
}

public class MultiThreading_extending_Thread {
    public static void main(String[] args) {
        for (int i=0; i<9; i++) {
            CustomThread thread = new CustomThread();
            thread.start();
        }
    }
}
