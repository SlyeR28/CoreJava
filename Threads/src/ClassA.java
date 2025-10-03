public class ClassA extends Thread {
    @Override
    public void run() {
        for (int i = 1; i<=5; i++){
            System.out.println("\t FROM Thread A : i = " +i);
        }
        System.out.println("Exit from Class A");
    }
}
