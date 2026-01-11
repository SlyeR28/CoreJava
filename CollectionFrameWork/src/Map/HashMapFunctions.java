package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapFunctions {
    public static void main(String[] args) throws InterruptedException {
//        Map<Integer, String> cls = new HashMap<>();
//        cls.put(12, "Rishabh");
//        cls.put(2, "Riya");
//        cls.put(3, "Karan");
//        cls.put(4, "Priya");
//        cls.put(5, "Sandeep");
//        cls.put(6, "Nisha");
//        cls.put(7, "Rahul");
//        cls.put(8, "Sneha");
//        cls.put(9, "Arjun");
//        cls.put(10, "Simran");
//        cls.put(11, "Rohit");
//
//
//        for (Integer i : cls.keySet()) {
//            System.out.println(cls.get(i));
//            cls.put(11 , "Suhani");
//        }
//
//
//        /*   by this method we can only get the values of that key is mapped
//            and we can not  perfrom any operations during the traversing the map
//            we can only read it not write it this will through an exception Concurrent Modification Exception
//        */
//         for (Map.Entry<Integer, String> entry : cls.entrySet()) {
//                    System.out.println(entry.getValue() + " -->" + entry.getKey());
//                }
//
//        /*
//        we can make only changes to update them we cannot change the structure of map while traversing
//         */
//
//        /*
//        if we want to change the structure then we have make changes then you have to use Iretator
//         */
//        Iterator<Map.Entry<Integer, String>> entrySet = cls.entrySet().iterator();
//        while (entrySet.hasNext()){
//            Map.Entry<Integer, String> entry = entrySet.next();
//            if(entry.getKey() == 2){
//                entrySet.remove();
//            }else if (entry.getKey() == 3){
//                entry.setValue("Ruahna");
//            }
//        }
//        System.out.println(cls);
//
//        Runnable t1 = () -> {
//            for(int i = 0; i<1000; i++){
//                cls.put(i , "rishabh i-"+ i);
//            }
//        };
//
//        Runnable t2 = () -> {
//            for(int i = 1000; i<2000; i++){
//                cls.put(i , "rishabh 2-"+ i);
//            }
//        };
//
//        Runnable t3 = () -> {
//            for(int i = 2000; i<3000; i++){
//                cls.put(i , "rishabh 3-"+ i);
//            }
//        };
//
//        Thread thread1 = new Thread(t1);
//        Thread thread2 = new Thread(t2);
//        Thread thread3 = new Thread(t3);
//
//        thread1.start();
//        thread2.start();
//        thread3.start();
//
//        thread1.join();
//        thread2.join();
//        thread3.join();
//
//        System.out.println(cls.size());

        /*
        as HashMap is not thread safe if we throw them in multi thread and try to perform any operation then i will
        be show data inconsistency that will
         */

        Map<Student , String>stringMap = new LinkedHashMap<>();

//        Student student1 = new Student(1 , "ankita");
//        Student student2 = new Student(2, "Ravi");
//        Student student3 = new Student(3, "Sneha");
//        Student student4 = new Student(4, "Mohit");


        stringMap.put(new Student(1 , "ankita") , "maths");
        stringMap.put(new Student(2, "Ravi") , "scinece");
        stringMap.put(new Student(3, "Sneha") , "computer");
        stringMap.put(new Student(4, "Mohit") , "biology");
        stringMap.put(new Student(4, "Mohit") , "stream");
        stringMap.put(new Student(4, "Mohit") , "socail");
        stringMap.put(new Student(1 , "ankita") , "logical");
        System.out.println(stringMap.size());


       
     }
}
