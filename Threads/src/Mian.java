public class Mian {
    public static void main(String[] args) {
        World world = new World();
         Thread t1 = new Thread(world);
         t1.start();

        for(int j = 0; j<10000; j++){
            System.out.println("hello");
        }
    }
}
