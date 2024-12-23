package Practise_preBoard_Exam;

import static java.lang.Thread.sleep;

class Odd implements Runnable {
   public  void run () {
        for (int i=1; i<=10; i++) {
            if(i%2==1) {
                System.out.println("odd numbers are: "+i);
                try {
                    sleep(1000);
                }catch(Exception e) {
                    System.out.println("error");
                }
            }
        }
    }
}

class Even implements Runnable {
    public void run () {
        for (int i=1; i<=10; i++) {
            if(i%2==0) {
                System.out.println("Even numbers are: "+i);
                try {
                    sleep(2000);
                }catch(Exception e) {
                    System.out.println("error");
                }
            }
        }
    }
}

public class Odd_Even_With_MultiThreading {
    public static void main(String[] args) {
        Odd obj = new Odd();
        Thread thread1 = new Thread(obj);
        thread1.start();

        Even obj2 = new Even();
        Thread thread2 = new Thread(obj2);
        thread2.start();
    }
}
