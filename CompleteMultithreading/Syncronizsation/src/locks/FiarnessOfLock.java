package locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FiarnessOfLock {

    private final Lock unfairLock = new ReentrantLock(true);

    public void accessResource(){
        unfairLock.lock();
        try{
            System.out.println(Thread.currentThread().getName() + "acquired the lock ");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }finally {
            System.out.println(Thread.currentThread().getName() + "Released the lock");
            unfairLock.unlock();
        }
    }

    public static void main(String[] args) {
        FiarnessOfLock lock = new FiarnessOfLock();
        Runnable task = lock::accessResource;
        Thread t1 = new Thread(task , "Thread1");
        Thread t2 = new Thread(task , "Thread2");
        Thread t3 = new Thread(task , "Thread3");
        Thread t4 = new Thread(task , "Thread4");
        Thread t5 = new Thread(task , "Thread5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

}
/*


Thread1acquired the lock
Thread1Released the lock
Thread2acquired the lock
Thread2Released the lock
Thread5acquired the lock
Thread5Released the lock
Thread4acquired the lock
Thread4Released the lock
Thread3acquired the lock
Thread3Released the lock

Thread1acquired the lock
Thread1Released the lock
Thread2acquired the lock
Thread2Released the lock
Thread3acquired the lock
Thread3Released the lock
Thread4acquired the lock
Thread4Released the lock
Thread5acquired the lock
Thread5Released the lock


 */