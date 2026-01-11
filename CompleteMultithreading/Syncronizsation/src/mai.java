public class mai {
    public static void main(String[] args)  {
        Counter counter = new Counter();
        Thread1 thread = new Thread1(counter);
        Thread1 thread2 = new Thread1(counter);
        thread.start();
        thread2.start();

        try {
            thread.join();
            thread2. join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println(counter.getCount());

    }
}
