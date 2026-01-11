package LmbdaExp;

import java.util.function.Function;
import java.util.function.Predicate;

public class Demo {
    public static void main(String[] args) {
        MathOperation sumOp = (a, b) -> (a + b);
        System.out.println( sumOp.operate(3 , 5));

        Predicate<Integer> isEven = x -> x % 2 == 0; // predicates are boolean valued functional interface
        System.out.println(isEven.test(4));

        Predicate<String> isWordStartingWithA = s -> s.startsWith(("A"));
        Predicate<String> isWordEndingWithT = s -> s.toLowerCase().endsWith("t");
        System.out.println(isWordStartingWithA.test("Ankit"));
        System.out.println(isWordStartingWithA.test("Rishabh"));
        System.out.println(isWordStartingWithA.and(isWordEndingWithT).test("Ankit"));
        System.out.println(isWordStartingWithA.and(isWordEndingWithT).test("Akshit"));

        // Function -> before java 8 we dont have any function support in java
        // functions in java are functional interface
        Function<Integer , Integer> doubleIt = x -> x*2;
        Function<Integer , Integer> tripleIt = x -> x*3;
        System.out.println(doubleIt.apply(20));
        System.out.println(doubleIt.andThen(tripleIt).apply(60));


        //Consumer





    }
}
@FunctionalInterface
interface MathOperation{
    int operate(int a , int b);
}
