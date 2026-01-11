package Map;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapOverview{
    public static void main(String[] args) throws InterruptedException {
        Map<String, Integer> map = new HashMap<>();
        map.put("suhani", 98);
        map.put("rishabh", 95);
        map.put("ankit", 88);
        map.put("neha", 91);
        map.put("tanya", 87);
        map.put("arjun", 90);
        map.put("divya", 84);
        map.put("rahul", 92);
        map.put("priya", 89);
        map.put("subham", 93);
        map.put("manish", 85);

        System.out.println( map.containsKey("suhani"));
        System.out.println( map.containsValue(67));
//        map.putIfAbsent("rishabh" , 99);
        System.out.println(map);
       map.getOrDefault("suhani" , 78);
        System.out.println(map);

//        List<Map.Entry<String , Integer>> list = new ArrayList<>(map.entrySet());
//
//        Collections.sort( list ,(a ,b) -> a.getValue().compareTo(b.getValue()));
//
//        for(Map.Entry<String , Integer> entry : list){
//            System.out.println(entry.getValue()  + " : " + entry.getKey());
//        }
//    }
        Map<Integer , String> map1 = new HashMap<>();

      Runnable thread1 = () -> {
          for(int i = 0; i<1000; i++){
              map1.put(i , "thread1-" +i);
          }
      };
      Runnable thread2 = ()->{
          for(int i = 1000; i<2000; i++){
              map1.put(i , "thread2- "+ i );
          }
      };
      Thread t1 = new Thread(thread1);
      Thread t2 = new Thread(thread2);
      t1.start();
      t2.start();

      t1.join();
      t2.join();
     map1.clear();
     
        System.out.println(map1.size());
    }
}
