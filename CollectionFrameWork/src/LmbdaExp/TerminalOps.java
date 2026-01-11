package LmbdaExp;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOps {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,3,4,4,5,5,6,6,7,7,7,7,8);
        // 1. -> collect


        List<Integer> collect = list.stream().collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(list.stream().filter(x -> x % 2 == 0).distinct().collect(Collectors.toList()));
        System.out.println(
                list.stream()
                        .filter(x -> x % 2 == 1)
                        .distinct()
                        .sorted((a , b) -> b-a)
                        .collect(Collectors.toList())
        );

        // for each -> comes with consumer it consumes something like print
        list.stream().filter(x -> x % 2 == 0).map(x -> x * 2).distinct().forEach(x -> System.out.println(x));

        // reduce
        Optional<Integer> reduce = list.stream().filter(x -> x % 2 == 0).map(x -> x * 2).distinct().reduce(Integer::sum);
        System.out.println(reduce.get());

        // count

        // anyMatch , allMatch , noneMatch


        List<String> names = Arrays.asList("Anna" , "Bob" , "Charlie" , "David");
        System.out.println( names.stream().filter(x -> x.length() <= 3).collect(Collectors.toList()));

        //squaring and sorting
        List<Integer> numbers = Arrays.asList(5 , 2, 9, 1, 6);
        System.out.println(numbers.stream().map(x -> x * x).sorted((a , b) -> a-b).collect(Collectors.toList()));

        // summing vales
        System.out.println(numbers.stream().reduce(Integer::sum));

        String sentence  = "Hello Worlld";
        System.out.println(sentence.chars().filter(ch -> ch == 'l').count());

        // stateful and stateless operation

    }
}
