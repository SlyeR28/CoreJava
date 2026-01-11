package locks;

public class mainn {
    public static void main(String[] args) {
        Lockss pnb = new Lockss();
        Runnable task = () -> pnb.withdraw(50);
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
    }
}
