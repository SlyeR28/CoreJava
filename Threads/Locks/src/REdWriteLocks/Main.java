package REdWriteLocks;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ReadWriteCounter counter = new ReadWriteCounter();
         Runnable readtask = new Runnable() {
             @Override
             public void run() {
                 for(int i = 0; i<10; i++){
                     System.out.println(Thread.currentThread().getName() + "Read: " +counter.getCount());
                 }
             }
         };

         Runnable writetask = new Runnable() {
             @Override
             public void run() {
             for (int i= 0; i<10; i++){
                 counter.increment();
                 System.out.println(Thread.currentThread().getName() + " Incremented");
             }
             }
         };

         Thread writerThread = new Thread(writetask);
         Thread readerThread1 = new Thread(readtask);
         Thread readerThread2 = new Thread(readtask);

         writerThread.start();
         readerThread1.start();
         readerThread2.start();

         writerThread.join();
         readerThread1.join();
         readerThread2.join();

        System.out.println("Final count: " +counter.getCount());
    }
}
