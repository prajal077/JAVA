import java.util.concurrent.Semaphore;

class SleepingBarber {
    static Semaphore waitingRoom = new Semaphore(3);
    static Semaphore barberChair = new Semaphore(1);
    static Semaphore barberPillow = new Semaphore(0);
    static Semaphore seatBelt = new Semaphore(0);
    static boolean allDone = false;

    public static void main(String[] args) {
        Thread barberThread = new Thread(() -> barber());
        barberThread.start();

        // Create customers and stagger their arrival
        for (int i = 1; i <= 5; i++) {
            final int id = i;
            new Thread(() -> customer(id)).start();
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
        }

        // Wait for all customers to finish
        try {
            Thread.sleep(7000); // Ensure all customers are processed
        } catch (InterruptedException e) {}

        // Set allDone to true and wake up the barber to exit
        allDone = true;
        barberPillow.release();  // Wake up the barber one last time to stop

        try {
            barberThread.join();  // Wait for the barber thread to finish
        } catch (InterruptedException e) {}
    }

    static void barber() {
        while (true) {
            try {
                barberPillow.acquire(); // Barber waits for a customer
                if (allDone) {
                    break;  // If all customers are done, barber exits
                }
                System.out.println("Barber is cutting hair.");
                Thread.sleep(1000); // Simulate haircut
                seatBelt.release();  // Allow customer to leave
            } catch (InterruptedException e) {}
        }
        System.out.println("Barber goes home.");
    }

    static void customer(int id) {
        try {
            if (waitingRoom.tryAcquire()) {
                barberChair.acquire(); // Wait for the barber chair to be free
                waitingRoom.release(); // Free up a waiting room chair
                System.out.println("Customer " + id + " waking the barber.");
                barberPillow.release(); // Wake the barber
                seatBelt.acquire(); // Wait for haircut to finish
                barberChair.release(); // Leave the barber chair
                System.out.println("Customer " + id + " is leaving.");
            } else {
                System.out.println("Customer " + id + " leaves (no chairs).");
            }
        } catch (InterruptedException e) {}
    }
}