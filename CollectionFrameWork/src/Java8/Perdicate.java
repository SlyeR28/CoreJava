package Java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Perdicate {
    public static void main(String[] args) {
        Predicate<Integer>isEven = x -> x % 2 ==0;
        System.out.println(isEven.test(8));
        Predicate<String> isWordStarswithA = x -> x.toLowerCase().startsWith("a");
        System.out.println(isWordStarswithA.test("ankit"));
        boolean test = isWordStarswithA.and(x -> x.toLowerCase().endsWith("t")).test("ankit");

        System.out.println(test);

        Function<Integer , Integer> doubleit = x -> x * 2;
        Integer apply = doubleit.andThen(x -> x * 3).apply(2);
        System.out.println(apply);


        Predicate<Integer> isOdd = x -> x%2 != 0;
        Function<Integer , Integer>fun = x -> x * 5;
        Consumer<Integer> re = x -> System.out.println(x);
        Supplier<Integer>supplier = ()->101;

        if(isOdd.test(supplier.get())){
            re.accept(fun.apply(supplier.get()));
        }


    }
}
