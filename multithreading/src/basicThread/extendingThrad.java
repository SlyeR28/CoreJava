package basicThread;

public class extendingThrad  extends Thread{

    public extendingThrad(String name) {
        super(name);
    }

    @Override
    public  synchronized  void run() {
        for(int i = 0; i<100 ; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        extendingThrad t1 = new extendingThrad("rishabh");
        extendingThrad t2 = new extendingThrad("suhani");
        t1.start();
        t2.start();

    }
}
