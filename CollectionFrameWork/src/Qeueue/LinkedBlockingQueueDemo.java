package Qeueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class Producerss implements Runnable{

    private BlockingQueue<Integer> blockingQeue;
    private int value = 0;

    public Producerss(BlockingQueue<Integer> blockingQeue) {
        this.blockingQeue = blockingQeue;
    }

    /**
     * Runs this operation.
     */


    @Override
    public void run() {
        while (true){
            System.out.println("Producer produces " + value);
            try {
                blockingQeue.put(value++);
                Thread.sleep(1000);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
                System.out.println("Producer Interrupted");
            }
        }


    }
}

class Consumerss implements Runnable{

    private BlockingQueue<Integer>queue;

    public Consumerss(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        while (true) {
            try {
                Integer take = queue.take();
                System.out.println("consumer consume " +take);
                Thread.sleep(2000);

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("consumer Interrupted ");
            }
        }
    }
}


public class LinkedBlockingQueueDemo {
    public static void main(String[] args) {
        BlockingQueue<Integer> ques = new LinkedBlockingQueue<>();
        Thread Producer = new Thread(new Producerss(ques));
        Thread cons = new Thread(new Consumerss(ques));

        Producer.start();;
        cons.start();
    }

}
/*


Producer produces 3
Producer produces 4
Producer produces 5
consumer consume 3
Producer produces 6
Producer produces 7
consumer consume 4
Producer produces 8
Producer produces 9
consumer consume 5
Producer produces 10
Producer produces 11
consumer consume 6
Producer produces 12
Producer produces 13
consumer consume 7
Producer produces 14
Producer produces 15
consumer consume 8
Producer produces 16
 */
