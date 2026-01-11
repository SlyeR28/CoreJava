package basicThread;

public class ImplementingThread implements  Runnable{
    @Override
    public void run() {
        for(int i = 0; i<1000; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        ImplementingThread thread = new ImplementingThread();
        Thread t1 = new Thread(thread);
        t1.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("main");
        }
    }
}
