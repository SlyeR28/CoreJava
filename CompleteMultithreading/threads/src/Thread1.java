public class Thread1 extends Thread{


    @Override
    public void run() {

            System.out.println("hello rishabh" + "RUNNING" +Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread1 thread1 = new Thread1();
        System.out.println(5 +8 + " " + Thread.currentThread().getName());
        System.out.println(thread1.getState());
        thread1.start();
        System.out.println(thread1.getState());
        Thread.sleep(100);
        thread1.join();
        System.out.println(thread1.getState());
    }
}
