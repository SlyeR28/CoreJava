public class Main {
    public static void main(String[] args) {
        long StartTime = System.currentTimeMillis();
        Thread [] thread = new Thread[9];
        for(int i = 1; i<10; i++){
            int finalI = i;
             thread[i-1] = new Thread(
                    () ->{
                        Long result = factorial(finalI);
                        System.out.println(result);
                    }
            );
            thread[i-1].start();

        }
        for(Thread thread1 : thread){
            try{
                thread1.join();
            }catch (InterruptedException e){
                thread1.currentThread().interrupt();
            }
        }
        System.out.println("Total time : " + (System.currentTimeMillis()- StartTime));
    }
    private static long factorial(int n){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
            long result = 1;
            for(int i =1; i<= n; i++){
                result *= i;
            }
            return  result;
    }
}