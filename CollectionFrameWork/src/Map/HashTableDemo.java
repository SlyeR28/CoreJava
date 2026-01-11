package Map;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class HashTableDemo {
    public static void main(String[] args) throws InterruptedException {
        Map<String , Integer> table = new Hashtable<>();

        table.put("Rishabh", 12);
        table.put("Amit", 8);
        table.put("Priya", 15);
        table.put("Suresh", 4);
        table.put("Anita", 9);
        table.put("Vikram", 20);
        table.put("Neha", 11);
        table.put("Karan", 7);
        table.put("Divya", 5);
        table.put("Rahul", 17);
        table.put("Tina", 6);
        table.put("Rohit", 13);

//         Runnable thread1 = ()-> {
//             for (Map.Entry<String, Integer> enties : table.entrySet()) {
//                 System.out.println(enties.getKey() + " :-->> " + enties.getValue());
//             }
//             for(int i = 0; i<10000; i++){
//                 table.put("threead" +i , i);
//             }
//         };
//
//        Runnable thread2 = ()-> {
//            for (Map.Entry<String, Integer> enties : table.entrySet()) {
//                System.out.println(enties.getKey() + " :-->> " + enties.getValue());
//            }
//            for(int i = 18750; i<200000; i++){
//                table.put("threead" +i , i);
//            }
//        };
//
//        Thread t1 = new Thread(thread1);
//        Thread t2 = new Thread(thread2);
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();
//
//        System.out.println(table.size());





//        System.out.println(table);
//
//        SortedMap<String , Integer> map = new TreeMap<>(
//                (a , b) -> (b.length() == a.length())?b.compareTo(a):b.length()-a.length());
//        map.putAll(table);
//        System.out.println(map);
//
//        Runnable thr1 = () ->{
//            for(int i = 0; i<2000; i++){
//                table.put("thread-1" + i , i);
//            }
//        } ;
//        Runnable thr2 = () ->{
//            for(int i = 2000; i<4000; i++){
//                table.put("thread-2" + i , i);
//            }
//        } ;
//
//        Thread t1 = new Thread(thr1);
//        Thread t2 = new Thread(thr2);
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();
//
//        System.out.println(table.size());
    }
}
