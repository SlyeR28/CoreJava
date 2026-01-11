import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStream {
    public static void main(String[] args) {
        // type of stream that enables parallel proccessing of elemnts

        List<String> list = Arrays.asList(
                "Hello World",
                "Java Streams are Powerful",
                "Flatmap are useful"
        );
        List<String> collect = list.stream()
                .flatMap(sentences -> Arrays.stream(sentences.split(" ")))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(collect);

        List<List<String>> list1 = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("oranges", "kiwi"),
                Arrays.asList("pear", "grapes")
        );
        System.out.println(list1.get(1).get(1));
        List<String> list2 = list1.stream()
                .flatMap(sent -> sent.stream())
                .map(String::toUpperCase)
                .toList();
        System.out.println(list2);



    }
}
