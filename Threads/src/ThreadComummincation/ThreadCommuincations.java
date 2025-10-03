//package ThreadComummincation;
//
//class SharedResource{
//    private int data;
//    private boolean hasdata;
//
//    public int  produce(){
//
//    }
//    public int  consume(){
//
//    }
//}
//
// class producer implements Runnable{
//    private SharedResource resource;
//
//    public producer(SharedResource resource){
//        this.resource = resource;
//    }
//
//     @Override
//     public void run() {
//         for(int i = 0; i<10; i++){
//             resource.produce(i);
//             System.out.println("Produced : " + i);
//         }
//     }
// }
//
// class Consumer implements Runnable{
//    private SharedResource resource;
//    public Consumer(SharedResource resource){
//        this.resource = resource;
//    }
//
//     @Override
//     public void run() {
//         for(int i =0 ; i<10; i++){
//             int value = resource.consume();
//             System.out.println("consumed : " +value);
//         }
//     }
// }
//
//public class ThreadCommuincations {
//}
