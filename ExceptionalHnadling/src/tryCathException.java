// null pointer exception
public class tryCathException {
    public static void main(String[] args) {
        try {
            System.out.println("outer try block  started");
        try{
            int n = 10;
            int res = n/0;
            System.out.println(res);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
            try {
                String s = null;
                System.out.println(s.length());
            } catch (NullPointerException e) {
                System.out.println("caught null pointer exception");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

         finally {  // finally keyword this will run no matter what exception is caught or not
             System.out.println("doo whatever you want to do ... i will run anyhow");
         }
    }
}
