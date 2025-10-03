public class ClassC extends Thread{
    @Override
    public void run() {
        for (int k = 1; k<=5; k++){
            System.out.println("\t FROM Thread C : k = " +k);
        }
        System.out.println("Exit from class C");
    }
}
