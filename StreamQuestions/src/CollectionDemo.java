import java.util.*;
import java.util.stream.Collectors;

public class CollectionDemo {
    public static void main(String[] args) {
        // 1-Collectors is a utility class
        List<String> list = Arrays.asList("Alice", "Bob", "Ankit", "Prince");
        List<String> collect = list.stream()
                .filter(x -> x.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(collect);

        // 2-collectors.toSet
        List<Integer> l1 = Arrays.asList(1, 2, 1, 2, 4, 5, 5, 6, 6, 7, 8, 9, 8, 9, 7, 4);
        Set<Integer> collect1 = l1.stream().collect(Collectors.toSet());
        System.out.println(collect1);

        // 3-collecting to a specific Collection
        ArrayDeque<String> collect2 = list.stream().collect(Collectors.toCollection(() -> new ArrayDeque<>()));
        System.out.println(collect2);

        // 4-joining Stream
        String concatnedNames = list.stream().map(String::toUpperCase).collect(Collectors.joining(","));
        System.out.println(concatnedNames);

        // 5- summarizing data
        // generates statistical summary (count , sum , min, average , max)
        List<Integer> number = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9);
        IntSummaryStatistics collect3 = number.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println(collect3);
        // we can use count sum min max ,av alone also

        //8 -> grouping elements
        List<String> strings = Arrays.asList("hello", "world", "java", "streams", "collecting");
        Map<Integer, List<String>> collect4 = strings.stream().collect(Collectors.groupingBy(String::length));
        Map<Integer, String> collect5 = strings.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(" ,")));
        Map<Integer, Long> collect6 = strings.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
        TreeMap<Integer, Long> collect7 = strings.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));


        System.out.println(collect4);
        System.out.println(collect5);
        System.out.println(collect6);
        System.out.println(collect7);

        //Partioning
        Map<Boolean, List<String>> collect8 = strings.stream().collect(Collectors.partitioningBy(x -> x.length() > 5));
        System.out.println(collect8);

        // mapping and collecting
        // applies a mapping function before collecting
        List<String> collect9 = strings.stream().collect(Collectors.mapping(x -> x.toUpperCase(), Collectors.toList()));
        System.out.println(collect9);

    }
}
