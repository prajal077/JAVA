package Practise_preBoard_Exam;

class Odd implements Runnable {
   public  void run () {
        for (int i=1; i<=10; i++) {
            if(i%2==1) {
                System.out.println("odd numbers are: "+i);
            }
        }
    }
}



class Even implements Runnable {
    public void run () {
        for (int i=1; i<=10; i++) {
            if(i%2==0) {
                System.out.println("Even numbers are: "+i);
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
