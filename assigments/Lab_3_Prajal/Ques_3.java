package assigments.Lab_3_Prajal;

/*WAP to create two threads
    1.This thread prints odd number from 1 to 10 by runnable interface in the span of 2 sec
    2.This thread prints Even number from 1 to 10 by extending thread in the span of 3 seconds
 */

import static java.lang.Thread.sleep;

class OddThread implements Runnable {
     public void run () {
         for(int i = 0; i<10; i++) {
             if(i%2==1) {
                 System.out.println("The odd numbers are: "+i);
                 try {
                     sleep(2000);
                 }catch(Exception e) {

                 }
             }
         }
     }
 }

class EvenThread extends Thread {
    public void run () {
        for(int i = 0; i<10; i++) {
            if(i%2==0) {
                System.out.println("The Even numbers are: "+i);
                try {
                    sleep(3000);
                }
                catch(Exception e) {

                }
            }
        }
    }
}

public class Ques_3 {
    public static void main(String [] args) {
        OddThread obj = new OddThread();
        Thread thread = new Thread(obj);
        thread.start();

        EvenThread obj2 = new EvenThread();
        obj2.start();
    }
}
