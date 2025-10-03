import locks.ReentranttLock.BankAccount;
import locks.SyncronizedIuuses;

public class Miannn {
    public static void main(String[] args) {
//        SyncronizedIuuses sbi = new SyncronizedIuuses();
//        Runnable task = () -> {
//            try {
//                sbi.withdraw(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        };
//        Thread t1 = new Thread(task,"thread1");
//        Thread t2 = new Thread(task ,"thread2");
//        t1.start();
//        t2.start();

        BankAccount sbi = new BankAccount();
        Runnable task = () -> sbi.withdraw(50);
        Thread t1 = new Thread(task , "thread_1");
        Thread t2= new Thread(task , "thread_2");
        t1.start();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.start();

    }
}
