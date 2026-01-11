package LmbdaExp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOps {
    public static void main(String[] args) {
        // Intermediate Operations transform a stream into another Stream
        // They are lazy in nature , meaning they will not execute until a terminal operation is invoked

        // filter
        List<String> list = Arrays.asList("Akshit" , "Ankit" , "Ram" , "Shyam" ,"GhanShyam","Akshit" , "Ankit" , "Ram" , "Shyam" ,"GhanShyam");
        Stream<String> stringStream = list.stream().filter(x -> x.startsWith("A"));
        // at this point there is no filter until we add terminal operation
        long count = stringStream.count();
        System.out.println(count);

        // Map
        List<String> collect = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);

        //sorted
        List<String> stringList = list.stream().sorted((a ,b) -> a.length() - b.length() ).collect(Collectors.toList());
        System.out.println(stringList);

        //unique
        List<String> collect1 = list.stream().filter(x -> x.startsWith("A")).distinct().collect(Collectors.toList());
        System.out.println(collect1);

        // itreate -> limit
        List<Integer> integers = Stream
                .iterate(1, x -> x + 1)
                .filter(x -> x % 2 == 1)
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(integers);

        // skip
        List<Integer> integers1 = Stream
                .iterate(1, x -> x + 1)
                .filter(x -> x % 2 == 1)
                .skip(2).limit(10)
                .collect(Collectors.toList());
        System.out.println(integers1);

    }
}
