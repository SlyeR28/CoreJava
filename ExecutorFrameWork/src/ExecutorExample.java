import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorExample {
    public static void main(String[] args) {
//     long StartTime = System.currentTimeMillis();
        ExecutorService exxcutor = Executors.newFixedThreadPool(3);
        for(int i = 1; i< 10; i++){
            int FinalI = i;
            exxcutor.submit( () -> {
                long result = factorial(FinalI);
                System.out.println(result);
                    }
            );
        }
        exxcutor.shutdown();
////        try{
////           while(! exxcutor.awaitTermination(10, TimeUnit.MILLISECONDS)){
////               System.out.println("waiting....");
////           }
////        } catch (InterruptedException e) {
////            throw new RuntimeException(e);
////        }
//        System.out.println("Total Time : " +(System.currentTimeMillis()- StartTime));

    }
    private static long factorial(int n){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long result = 1;
        for(int i = 1; i<=n; i++){
             result *= i;
        }
        return result;
    }
}
