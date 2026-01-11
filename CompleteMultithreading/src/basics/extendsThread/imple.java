package basics.extendsThread;

public class imple implements Runnable{

    @Override
    public  void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println("hello " + " : " + Thread.currentThread().getName());
        }
    }

    public static  void main(String[] args) {
        imple t1 = new imple();
        Thread thread = new Thread(t1);
        thread.start();

        for (int i = 0; i < 500; i++) {
            System.out.println("World " + " : " + Thread.currentThread().getName());
        }
    }
}
