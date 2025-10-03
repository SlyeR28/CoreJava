class ClassAA extends Thread {
    @Override
    public void run() {
        for (int i = 1; i<=5; i++){
            System.out.println("\t FROM Thread A : i = " +i);
        }
        System.out.println("Exit from Class A");
    }
}
class ClassBB extends Thread{
    @Override
    public void run() {
        for (int j = 1; j<=5; j++){
            System.out.println("\t FROM Thread B : j = " +j);
        }
        System.out.println("Exit from class B");
    }
}
class ClassCC extends Thread{
    @Override
    public void run() {
        for (int k = 1; k<=5; k++){
            System.out.println("\t FROM Thread C : k = " +k);
        }
        System.out.println("Exit from class C");
    }
}

public class NewMian {
    public static void main(String[] args) {
//        new ClassAA().start();
//        new ClassBB().start();
//        new ClassCC().start();
   for (int l = 0; l<10000; l++){
       System.out.println("Hello");
   }
    }
}
