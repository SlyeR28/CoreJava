public class ClassB extends Thread{
    @Override
    public void run() {
        for (int j = 1; j<=5; j++){
            System.out.println("\t FROM Thread B : j = " +j);
        }
        System.out.println("Exit from class B");
    }
}
