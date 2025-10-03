package Map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class hashhmmap {
    public static void main(String[] args) {
        Map<Integer , String> mapp = new HashMap<>();

        mapp.put(34, "ankit");
        mapp.put(12, "rishabh");
        mapp.put(24, "subham");
        mapp.put(45, "rahul");
        mapp.put(56, "amit");
        mapp.put(67, "neha");
        mapp.put(78, "priya");
        mapp.put(89, "arjun");
        mapp.put(90, "sneha");
        mapp.put(21, "manish");
        mapp.put(32, "tanya");
        mapp.put(43, "vishal");
        mapp.put(54, "divya");
        /*
        tanya
ankit
neha
vishal
rishabh
rahul
priya
manish
divya
subham
amit
arjun
sneha
         */

//        System.out.println(mapp);
//        String student = mapp.get(3);
//        System.out.println(student);
//        System.out.println(mapp.containsKey(3));
//        System.out.println(mapp.get(1));
//        Set<Integer> integers = mapp.keySet();
//        for(int i : integers){
//            System.out.println(mapp.get(i));
//        }

//        for(int i : mapp.keySet()){
//            System.out.println(mapp.get(i));
//        }
        Set<Map.Entry<Integer , String>>   entries = mapp.entrySet();
        for (Map.Entry<Integer , String> entry :entries){
            System.out.println(entry.getValue().compareToIgnoreCase("ait") + " : " +  entry.getKey());
        }
    }

}
