package Java8;

import javax.swing.text.StyledEditorKit;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Minsff {
    public static void main(String[] args) {


//        List<Transactions> transactions = Arrays.asList(new Transactions("2022-01-01", 100),
//                new Transactions("2022-01-01", 200),
//                new Transactions("2022-01-02", 300),
//                new Transactions("2022-01-02", 400),
//                new Transactions("2022-01-03", 500));
//
//        Map<String, Integer> collect = transactions.stream()
//                .collect(Collectors.groupingBy(Transactions::getDate,
//                        Collectors.summingInt(Transactions::getDailyExpense)));
//        System.out.println(collect);

//        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry",
//                "banana", "apple");
//
//        Map<String, Long> collect = words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(collect);

        LocalTime startSeq = LocalTime.now();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 23, 3,4,34,5,5, 677,67,67,6,75,3,4,3657,56,74574,7,47,4,74574);
       Map<Boolean , List<Integer>> listMap =  numbers.stream().collect(Collectors.partitioningBy(x -> x%2 ==0));
       List<Integer>even = listMap.get(true);
       List<Integer>odd = listMap.get(false);
       LocalTime endSeq = LocalTime.now();

        System.out.println(even);
        System.out.println(odd);
        System.out.println( "time required : -> " + Duration.between(startSeq ,endSeq).toMillis());

    }
}
