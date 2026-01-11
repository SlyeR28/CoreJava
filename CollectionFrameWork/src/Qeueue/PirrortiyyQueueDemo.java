package Qeueue;

import javax.print.attribute.standard.RequestingUserName;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class PirrortiyyQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        //part of queue interface
        // when you want to give pirority to any element o natural or custom ordering then you can use
        // use min heap algorithm for its implementations

        Queue<Integer> queue = new PriorityQueue<>();
//        queue.add(150);
//        queue.add(100);
//        queue.add(17);
//        queue.add(50);
//        queue.add(15);
//
////        System.out.println(queue.remove());
//        System.out.println(queue);// not sorted
//
//        while (!queue.isEmpty()) {
//            System.out.println(queue.poll());
//        }

        Runnable th1 = () -> {
            for (int i = 0; i < 1000; i++) {
                  queue.add(i+3);
              }
        };

        Runnable th2 = () -> {
            for (int i = 1000; i < 2000; i++) {
                  queue.add(i+5);
              }
        };

        Thread t1 = new Thread(th1);
        Thread t2 = new Thread(th2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(queue.size());
    }
}
//[15, 17, 100, 150, 50]
// 15 ,17, 50 , 100 , 150
/*
15
17
50
150
 */
