package Java8;

public class LmdaExperssion {

    /*
    java 8 -> minimal code , functional programming ,
    lambda expression , Streams , Date and Time Api
     */

    public static void main(String[] args) {
        /*
        functional interface
         */

        Thread  th1 = new Thread(() -> {
            System.out.println("hello");
        });
        th1.start();

        MathOperation mathOperation = (a , b) -> a+ b;
        MathOperation Operation = (a , b) -> a- b;
        MathOperation mathOn = (a , b) -> a * b;
        MathOperation matration = (a , b) -> a / b;

        System.out.println(mathOperation.operate(1 ,2));
        System.out.println(mathOperation.operate(4,5));
        System.out.println(matration.operate(5,6));
        System.out.println(mathOn.operate(8,9));
        System.out.println(Operation.operate(8,9));


    }
    interface MathOperation{
        int operate(int a , int b);
    }


}
