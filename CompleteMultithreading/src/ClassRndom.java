public class ClassRndom {
    public static void main(String[] args) {
        System.out.println(5 + 6  + " : " + Thread.currentThread().getName());
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("my name is rishabh kumar " + " : " + Thread.currentThread().getName());
            }
        };

        Runnable task2 = ()-> System.out.println("i have done btech form dy patil" + " : " + Thread.currentThread().getName());
        Thread t2 = new Thread(task2 , "thread3");

        Thread t1 = new Thread(task , "Riya kumari");
        t1.start();
        t2.start();
    }
}
