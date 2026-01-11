package Map;

import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

public class SkipListOveriview {
    public static void main(String[] args) throws InterruptedException {


        ConcurrentSkipListMap<String , Integer> map = new ConcurrentSkipListMap<>();
        map.put("rishabh" , 12);
        map.put("ananya", 25);
        map.put("arjun", 30);
        map.put("priya", 18);
        map.put("manish", 45);
        map.put("tanya", 22);
        map.put("saurabh", 33);
        map.put("neha", 27);
        map.put("rohan", 40);
        map.put("divya", 29);
        map.put("kartik", 35);
        map.put("mohan", 50);

//        Runnable t1 = () -> {
//            for (int i = 0; i<1000; i++){
//                map.put("t1" + i , i);
//            }
//        };
//
//        Runnable t2 = () -> {
//            for (int i = 1000; i<2000; i++){
//                map.put("t1" + i , i);
//            }
//        };
//
//        Thread thread1 = new Thread(t1);
//        Thread thread2 = new Thread(t2);
//
//        thread2.start();
//        thread1.start();
//
//        thread1.join();
//        thread2.join();
//
//        int x = map.size();
//
//        System.out.println(x);


        for(Map.Entry<String , Integer>entriess : map.entrySet()){
            System.out.println(entriess.getKey() + " -> " + entriess.getValue());
        }
    }
}
