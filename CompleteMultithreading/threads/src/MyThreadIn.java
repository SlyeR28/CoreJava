public class MyThreadIn extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("Thread is Running....");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " +e);
        }
//        for (int i = 0; i<= 50; i++){
//            System.out.println("wrolff");
//        }
    }

    public static void main(String[] args) {
        MyThreadIn t1 = new MyThreadIn();
       t1.start();
       t1.interrupt();
    }
}
