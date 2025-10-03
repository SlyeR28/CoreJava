package basics.extendsThread;

public class Main {
    public static void main(String[] args) {
        Mythread2 mythread2 = new Mythread2();
        Mythread1 mythread1 = new Mythread1();
        Mythread3 mythread3 = new Mythread3();
        Mythread4 mythread4 = new Mythread4();

        // Start threads only once
        mythread2.start();
        mythread1.start();
        mythread3.start();
        mythread4.start();

        // Monitor thread status
        while (true) {
            int count = 0;

            if (mythread2.isAlive()) count++;
            if (mythread1.isAlive()) count++;
            if (mythread3.isAlive()) count++;
            if (mythread4.isAlive()) count++;

            System.out.println("Active threads: " + count);

            // Sleep to avoid overwhelming CPU and console
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
                break;
            }

            // Exit loop if all threads are done
            if (count == 0) {
                System.out.println("All threads have finished.");
                break;
            }
        }
    }
}
