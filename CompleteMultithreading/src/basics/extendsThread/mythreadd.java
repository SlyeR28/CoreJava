package basics.extendsThread;

public class mythreadd {
    public static void main(String[] args) {
        Thread8 thread8 = new Thread8();
         thread8.start();
        for (int i = 0; i<1000; i++){
            System.out.println("world" + " : " + Thread.currentThread().getName());
        }

    }
}
