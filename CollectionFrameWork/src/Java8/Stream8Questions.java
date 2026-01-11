package Java8;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream8Questions {

  static boolean IsPrime(int number){
        if(number <= 1){
            return false;
        }
        for(int i = 2; i<= Math.sqrt(number); i++){
            if(number % i== 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Person pe1 = new Person("Rishabh", 35);
        Person pe2 = new Person("Aarav", 28);
        Person pe3 = new Person("Isha", 24);
        Person pe4 = new Person("Vikram", 42);
        Person pe5 = new Person("Neha", 31);
        Person pe6 = new Person("Manish", 39);
        Person pe7 = new Person("Priya", 26);
        Person pe8 = new Person("Aditya", 33);
        Person pe9 = new Person("Kavita", 29);
        Person pe10 = new Person("Rahul", 41);
        Person pe11 = new Person("Sneha", 22);
        Person pe12 = new Person("Ravi", 36);
        Person pe13 = new Person("Pooja", 27);
        Person pe14 = new Person("Arjun", 30);
        Person pe15 = new Person("Simran", 25);

        List<Person> personList = Arrays.asList(pe1, pe2, pe3, pe4, pe4, pe5, pe6, pe7, pe7, pe8, pe9, pe10,
                pe11, pe12, pe13, pe14, pe15);



        LocalTime startSeq = LocalTime.now();

      double avgSeq =  personList.stream().mapToDouble(Person::getAge).average().orElse(0);
        LocalTime endSeq = LocalTime.now();
        System.out.println();
        System.out.println("Average age (Sequential Stream): " + avgSeq);
        System.out.println("Sequential Execution Time: " + Duration.between(startSeq, endSeq).toMillis() + " ms\n");

        LocalTime startPar = LocalTime.now();
        double v = personList.parallelStream().mapToDouble(Person::getAge).average().orElse(0);
        LocalTime endPar = LocalTime.now();
        System.out.println("Average age (Sequential Stream): " + v);
        System.out.println("Sequential Execution Time: " + Duration.between(startPar, endPar).toMillis() + " ms\n");

        List<Integer>list = Arrays.asList(1,23,5,34,2,1,43,5,35,3,53,56767,11, 13,32356,6,78,34,21,9,7,17 ,19);
        boolean anyMatch = list.stream().anyMatch(Stream8Questions::IsPrime);
        System.out.println(anyMatch);

        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> collect = Stream.concat(list1.stream(), list2.stream()).sorted().collect(Collectors.toList());
        System.out.println(collect);
        List<Integer> collect1 = list1.stream().filter(list2::contains).collect(Collectors.toList());

        System.out.println(collect1);

        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);
        System.out.println(numbersWithDuplicates.stream().distinct().collect(Collectors.toList()));


    }

}