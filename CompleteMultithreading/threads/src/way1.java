public class way1 {
    public static void main(String[] args) {
        world world = new world();
        world.start();

      for (int i = 0; i< 100000; i++){
          System.out.println(Thread.currentThread().getName());
      }
    }
}
