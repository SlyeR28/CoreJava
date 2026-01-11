import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsExample {
    public static void main(String[] args) {
        // collection by Names by length
        List<String> list = Arrays.asList("Anna", "Bob", "Alexander", "Brain", "Alice");
        Map<Integer, List<String>> collect = list.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(collect);

        // counting word occurrences
        String sentence = "Hello World Hello java World";
        Map<String, Long> collect1 = Arrays
                .stream(sentence.split(" "))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(collect1);

        // Partioning by odd even
        Stream<Integer> integerStream = Stream.iterate(1, x -> x + 1).limit(30);
        Map<Boolean, List<Integer>> collect2 = integerStream.collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println(collect2);

        //summing values in map
        HashMap<String, Integer> items = new HashMap<>();
        items.put("Apple" , 10);
        items.put("Banana" , 20);
        items.put("Orange" , 30);
        Integer present = items.values().stream().reduce(Integer::sum).orElseThrow(() -> new RuntimeException("No value present"));
        System.out.println(present);
        // second way
        Integer collect3 = items.values().stream().collect(Collectors.summingInt(x -> x));
        System.out.println(collect3);
        // third way
        int sum = items.values().stream().mapToInt(x -> x).sum();
        System.out.println(sum);

        // we are getting here length with counting
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
        Map<Integer, List<String>> collect4 = fruits.stream().collect(Collectors.groupingBy(String::length, Collectors.toList()));
        System.out.println(collect4);


        // create a map from Stream elements
        Map<String, Integer> collect5 = fruits.stream().collect(Collectors.toMap(String::toUpperCase, String::length));
        System.out.println(collect5);



    }
}
