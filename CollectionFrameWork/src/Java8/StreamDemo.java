package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,2,24,4,3,4,5,5,286,6,434,567,5,734,43,53,343,4,3,42,2);
        long collect = list.stream().filter(x -> x % 2 == 0).count();
        System.out.println(collect);

        List<String> strings = Arrays
                .asList("apple", "banana", "cherry", "date", "grapefruit");
        Optional<String> max = strings.stream().max(Comparator.comparingInt(String::length));
        System.out.println(max);
    }
}
