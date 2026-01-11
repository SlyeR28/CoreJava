public class Way2 {
    public static void main(String[] args) {
        Wavy wavy = new Wavy();
        Thread thread = new Thread(wavy);
        thread.start();


        for (int i = 0; i < 10000; i++) {
            System.out.println("world" + " "  +Thread.currentThread().getName());

        }
    }
}
