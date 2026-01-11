package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU <K, V>extends LinkedHashMap<K ,V> {

    private int capacity;


    public LRU(int capacity) {
        super(capacity , 0.75f , true);
        this.capacity = capacity;
    }



    public static void main(String[] args) {
        LRU<String , Integer> map = new LRU<String , Integer>(3);

        map.put("rishabh" , 90);
         map.put("Ankit" , 98);
         map.put("prakhar" , 56);
         map.put("prince" , 77);
         map.put("suhani" , 89);
         map.putFirst("rajesh" , 67);
         map.putLast("amann" , 88);


        map.get("prakhar");
        map.get("Ankit");
        map.get("prince");
        map.get("rishabh");
        map.get("prakhar");
        map.get("suhani");
        map.get("rishabh");
        map.get("prince");
        map.get("Ankit");
        map.get("suhani");
        map.get("rishabh");
        map.get("prakhar");
        map.get("Ankit");
        map.get("prince");
        map.get("suhani");



        for(Map.Entry<String , Integer> entries:map.entrySet()){


            System.out.println(entries.getKey()  + " : " + entries.getValue());
        }

        /*
        if you want to insert then you have to convert your map into irtetator
         */

//        Iterator<Map.Entry<String , Integer>> entries = hashmap.entrySet().iterator();
//        while(entries.hasNext()){
//            Map.Entry<String , Integer> entry = entries.next();
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//            entries.remove();
//        }





    }
}
