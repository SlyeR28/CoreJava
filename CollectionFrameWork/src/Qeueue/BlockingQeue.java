package Qeueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

 class Producer implements Runnable{

    private BlockingQueue<Integer> queue;
    private int value = 0;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    /**
     * Runs this operation.
     */
    @Override
    public void run() {
    while (true){
        System.out.println("Producer produced : " +value);
        try {
            queue.put(value++);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
           Thread.currentThread().interrupt();;
            System.out.println("Producer interrupted");
        }

    }
    }
}

class Cosumer implements Runnable {

    private BlockingQueue<Integer> queue;


    public Cosumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        while (true) {

            try {
                Integer value = queue.take();
                System.out.println("Consumer consumed  : " +value);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                ;
                System.out.println("Consumer interrupted");
            }

        }
    }
}

public class BlockingQeue {


    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Cosumer(queue));

        producer.start();
        consumer.start();



    }
}
