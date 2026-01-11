package locks;

public class Testa {
    public static void main(String[] args) {
        BnakAccount sbi = new BnakAccount();
        Runnable task = ()-> sbi.withdraw(50);
        Thread t1 = new Thread(task ,"Thread1");
        Thread t2 = new Thread(task ,"Thread2");
        t1.start();
        t2.start();

    }
}
