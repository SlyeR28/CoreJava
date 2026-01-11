public class DeamonSThread  extends  Thread{


//    public DeamonSThread(String name) {
//        super(name);
//    }


    @Override
    public void run() {
        while (true){
            System.out.println("Hello World !");
        }
    }

    public static void main(String[] args) {
        DeamonSThread t1 = new DeamonSThread();
        t1.setDaemon(true);
        t1.start();
        System.out.println("hello....123");
    }
}
