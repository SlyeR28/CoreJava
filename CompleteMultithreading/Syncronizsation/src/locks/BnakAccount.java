package locks;

public class BnakAccount  {
    private int balance = 100;


    public synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + "Attempting to Withdraw " + amount);
        if(balance >= amount){
            System.out.println(Thread.currentThread().getName() + "Withdrawing process... " + amount);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {

            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + "Completed withdrawal : . Remaining balance: " + balance);
        }else {
            System.out.println(Thread.currentThread().getName() + "Insufficient balance ");
        }
    }
}

// here we are using synchronized keyword lets assume if your system gets slow down
// one thread is taking to much time to execute so thread 2 will have ot wait much time then other
// so what ? -> locks....