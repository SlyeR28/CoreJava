package locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lockss {

    private int balance = 100;

    private final Lock lock = new ReentrantLock();


    public  void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + "Attempting to Withdraw " + amount);
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + "Withdrawing process... " + amount);
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + "Completed withdrawal : . Remaining balance: " + balance);
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + "insufficent balance ");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + "could not acquire the lock , will try later");
            }

        } catch (InterruptedException e) {
           Thread.currentThread().interrupt();
        }
        if(Thread.currentThread().isInterrupted()){
            System.out.println(" ");
        }
    }
}


