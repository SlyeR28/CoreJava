package Map;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentMap<Integer , String> map = new ConcurrentHashMap<>();

        // Add 10–12 entries (ItemID → ItemName)
        map.put(101, "Laptop");
        map.put(103, "Tablet");
        map.put(104, "Headphones");
        map.put(108, "Printer");
        map.put(105, "Keyboard");
        map.put(106, "Mouse");
        map.put(102, "Smartphone");
        map.put(107, "Monitor");
        map.put(111, "Camera");
        map.put(109, "Speaker");
        map.put(110, "Smartwatch");
        map.put(112, "Router");

//        for(Map.Entry<Integer , String>entry : map.entrySet()){
//            map.put(110, "New Smartwatch");
//            map.put(115, "honey Smartwatch");
//            map.replace(107, "Monitor", "4K Monitor");
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }


     // won't overwrite existing
       // replaces only if matches old value

        System.out.println("++++++++++++++++++++++++++++++++++++++=");

        for(Map.Entry<Integer , String>entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
