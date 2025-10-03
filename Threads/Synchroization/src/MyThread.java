public class MyThread extends  Thread{

    private Counter counterr;

    public MyThread(Counter counterr){
        this.counterr = counterr;

    }

    @Override
    public void run() {
        for(int i = 0; i<1000; i++){
            counterr.increment();
        }
    }
}
