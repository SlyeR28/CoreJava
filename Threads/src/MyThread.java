public class MyThread extends Thread {
    public MyThread(String Name){
        super(Name);

    }

    @Override
    public void run() {
       for (int i = 0; i<5; i++){
          String a = " ";
           for(int j = 0; j<100000; j++){
                    a += "a";
           }
           System.out.println(Thread.currentThread().getName() + " -Priority: " + Thread.currentThread().getPriority() + "-count " + i);
           try{
               Thread.sleep(100 );
           } catch (Exception e) {
               throw new RuntimeException(e);
           }
       }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread h = new MyThread("rishabh");
        MyThread l = new MyThread("rishabh");
        MyThread m = new MyThread("rishabh");
        h.setPriority(Thread.MAX_PRIORITY);
        m.setPriority(Thread.MIN_PRIORITY);
        l.setPriority(Thread.NORM_PRIORITY);


         h.start();
         m.start();
         l.start();
    }
}