public class BankAccount {
    private int Balance = 100;

    public synchronized void withdrawal(int amount){
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw: " + amount);
        if(Balance >= amount){
            System.out.println(Thread.currentThread().getName() + "proceeding with withdrawal ");
            try{
                Thread.sleep(3000);
            } catch (InterruptedException e) {

            }
            Balance -= amount;
            System.out.println(Thread.currentThread().getName() + "Completed withdrawal..Remaining Balance: " + Balance);
        }else {
            System.out.println(Thread.currentThread().getName() + "Insufficient balance  ");
        }
    }
}
