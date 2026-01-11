package Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class LinkedHashMapFunctions {
    public static void main(String[] args) throws InterruptedException {

        Map<String , String> linked = new LinkedHashMap<>();

        linked.put("Rishabh" , "Maths");
        linked.put("Amit", "Physics");
        linked.put("Neha", "Chemistry");
        linked.put("Sita", "Biology");
        linked.put("Rahul", "English");
        linked.put("Priya", "History");
        linked.put("Vikram", "Geography");
        linked.put("Anjali", "Computer");
        linked.put("Karan", "Economics");
        linked.put("Simran", "Sanskrit");
        linked.put("Rohit", "Music");
        linked.put("Pooja", "Art");

       /*
       linkedHashMap -> all same properties that share hashmap the only major difference is that it maintain or track of
       insertion of elements or object and it is slow as compared to Hashmap b/c of maintaining the order
        all basic operations take O(1)
        */

//        for(String s : linked.keySet()){
//            System.out.println(linked.get(s));
//            linked.remove("Karan");
//            linked.put("arman" , "Btech");
//        }
        /*
        if we try change the structure during the traverse we will get an runtime exception of
        ConcurrentModificationException but can update the values of regarding keys
         */


        for(String s : linked.keySet()){
            System.out.println(linked.get(s));
//           linked.put("Pooja" , "Science");
          if(Objects.equals(linked.get(s) , "Rahul")){
              linked.put("Rahul " , "Computer");
          }

        }
        for (Map.Entry<String , String> st : linked.entrySet()){
            System.out.println(st.getKey() + " :-> " +st.getValue());
            if (Objects.equals(st.getValue(), "Rahul")) {
                st.setValue("Computer"); // safe to modify value
            }
        }
        System.out.println(linked);


        Runnable t1 = () -> {
            for (int i = 0; i<1000; i++){
                linked.put("rishu" + i ,"thread1 is working" );
            }
        };
        Runnable t2 = () -> {
            for (int i = 1000; i<2000; i++){
                linked.put("suahni" + i ,"thread2 is working" );
            }
        };
       Thread thread1 = new Thread(t1);
       Thread thread2 = new Thread(t2);

       thread1.start();
       thread2.start();
       thread1.join();
       thread2.join();

        System.out.println(linked.size());
    }
}
