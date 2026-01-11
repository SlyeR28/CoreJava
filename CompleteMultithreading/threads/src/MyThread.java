public class MyThread  extends Thread{

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run(){
        for (int i = 1; i<=5; i++){

            System.out.println(Thread.currentThread().getName() +
                    "- Priority: " +Thread.currentThread().getPriority()
                    + "- Count " + i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread l = new MyThread("Low Priority Thread");
        MyThread m = new MyThread("Norm Priority Thread");
        MyThread h = new MyThread("High Priority Thread");
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        h.start();
        h.join();
        System.out.println(Thread.currentThread().getName() + " - " + "Hello...");

    }
}

// Start -> used to run the thread
// run -> method that is over ride and contain main logic to be executed by thread
// join -> wait to get termination of different thread
// setPriority -> just to provide jvm and os that treat this thread as low high medium
// interrupt ->
// Yield -> provides different threads to execute
// setDemon