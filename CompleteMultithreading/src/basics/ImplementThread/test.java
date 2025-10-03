package basics.ImplementThread;

public class test  extends Thread{
    @Override
    public void run() {

    }

    public static void main(String[] args) {
         test t = new test();
        System.out.println(t.getState());
         t.start();
        System.out.println(t.getState());
    }
}
