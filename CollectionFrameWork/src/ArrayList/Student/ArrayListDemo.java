package ArrayList.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());
         Runnable task = ()-> {
             for (int i = 0; i < 1000; i++) {
                 list.add(i);
             }
         };

         Thread t1 = new Thread(task);
         Thread t2 = new Thread(task);
         Thread t3 = new Thread(task);

         t1.start();
         t2.start();
         t3.start();

         t1.join();
         t2.join();
         t3.join();

        System.out.println("expected osze = 3000");
        System.out.println(list.size());
    }
}
// insertion
// size == inital capacity
// 20 ->
// first it will make a new array of intial capacity of 20
// second -> it will copy the element from 1- 10 index
// third -> 11 elemnt -> 11 index
//

 // 1, 1,,1,1,1,1