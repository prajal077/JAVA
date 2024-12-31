package Final_Practise;


import static java.lang.Thread.sleep;

class Even implements Runnable {
    public void run () {
        for(int i=0; i<=10; i++) {
            if(i%2==0) {
                System.out.println(i);
                try {
                    sleep(1000);
                }catch(Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}

class Odd extends Thread {
    public void run () {
        for(int i=10; i<=20; i++) {
            if(i%2 !=0) {
                System.out.println(i);
                try {
                    sleep(2000);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}

public class Odd_Even_Thread_Timer {
    public static void main(String[] args) {
        Even obj1 = new Even();
        Thread thread1 = new Thread(obj1);
        thread1.start();

        Odd obj2 = new Odd();
        obj2.start();
    }
}
