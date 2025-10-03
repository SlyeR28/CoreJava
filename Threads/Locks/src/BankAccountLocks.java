import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccountLocks {
    private int Balance = 100;

    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + "attempting to withdraw " +amount);
       try{
          if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
              if (Balance >= amount) {
                  try {
                      System.out.println(Thread.currentThread().getName() + "Proceeding with withdrawal");
                      Thread.sleep(3000);
                      Balance -= amount;
                      System.out.println(Thread.currentThread().getName() + "Completed withdrawal....Remaining Balance: " + Balance);
                  } catch (Exception e) {
                     Thread.currentThread().interrupt();
                  } finally {
                      lock.unlock();
                  }

              } else {
                  System.out.println(Thread.currentThread().getName() + "insufficient Balance");
              }
          }
            else {
               System.out.println(Thread.currentThread().getName() + " could not acquire the lock..will  try again later");
           }

       } catch (InterruptedException e) {
             Thread.currentThread().interrupt();
       }

    }
}
