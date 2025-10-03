package Deadlock;

class Pen{
   public synchronized void writewithpenandpaper(Paper paper){
      System.out.println(Thread.currentThread().getName() + "is using " +this+ "and trying to use paper");
      paper.finishWritng();
   }

   public void finishWriting() {
      System.out.println(Thread.currentThread().getName() + " finished using pen " +this);
   }
}
    class Paper{
   public synchronized void writewithpenandpaper(Pen pen){
      System.out.println(Thread.currentThread().getName() + " is using paper " +this + "and trying to use pen");
      pen.finishWriting();
   }
    public void finishWritng() {
       System.out.println(Thread.currentThread().getName() + " finished using paper " +this);
       }
    }

    class task1 implements Runnable{
  private Pen pen;
  private Paper paper;

       public task1(Pen pen, Paper paper) {
          this.pen = pen;
          this.paper = paper;
       }

       @Override
       public void run() {
          pen.writewithpenandpaper(paper);
       }
    }
class task2 implements Runnable {
   private Pen pen;
   private Paper paper;

   public task2(Pen pen, Paper paper) {
      this.pen = pen;
      this.paper = paper;
   }

   @Override
   public void run() {
      paper.writewithpenandpaper(pen);
   }
}
public class DeadLockExample {
   public static void main(String[] args) {
      Pen pen = new Pen();
      Paper paper = new Paper();

      Thread thread1 = new Thread(new task1(pen,paper) ,"thread-1");
      Thread thread2 = new Thread(new task2(pen,paper) ,"thread-2");

      thread1.start();
      thread2.start();
   }

}
