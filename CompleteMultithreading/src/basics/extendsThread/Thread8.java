package basics.extendsThread;

public class Thread8 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello  " + " : " + Thread.currentThread().getName());
        }
    }
}
