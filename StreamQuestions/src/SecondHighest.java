import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondHighest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(88, 34,11 ,5,6,78,34,553,889,789,12,56);
        List<Integer> collect = numbers.stream().sorted((a ,b) -> b-a).limit(2).collect(Collectors.toList());
        collect.stream().skip(1).forEach(System.out::println);
        // this will fail in duplicates methods and maybe overflow

        // optimal solutions
        List<Integer> numbers2 = Arrays.asList(88, 34, 11, 5, 6, 78, 34, 553, 889, 789, 12, 56);
        Integer sec = numbers2.stream()
                .distinct()
                .sorted()
                .skip(numbers2.stream().distinct().count() - 2)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Not enough elements"));
        System.out.println(sec);

        List<Integer> list = Arrays.asList(5, 9, 12, 18, 7);
        Integer areFound = list.stream().filter(x -> x % 2 != 0)
                .map(x -> x * x)
                .reduce(Integer::sum)
                .orElseThrow(() -> new RuntimeException("No Odd elements are found"));
        System.out.println(areFound);


        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 7, 9);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8, 10);
        List<Integer> collect1 = Stream.concat(list1.stream(), list2.stream()).distinct()
                .collect(Collectors.toList());
        System.out.println(collect1);
    }








}
