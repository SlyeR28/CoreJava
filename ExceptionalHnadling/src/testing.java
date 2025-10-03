public class testing {
    public static void main(String[] args) {
      int n = 10;
      int m = 5;

      try{
          int ans = n/m;
          System.out.println("answer is " +ans);
      } catch (ArithmeticException e) {
          System.out.println("dividing by zero is not allowed");
      }finally {
          System.out.println("program continues to find exception");
      }



    }
}
