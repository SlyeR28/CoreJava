package practise;

public class Mainnn {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.sleep();
        d.sound();
         System.out.println(Animals.MAX_AGE);


        Animals cat = new Animals() {
            @Override
            public void eat() {
                System.out.println("Cart is eating ");
            }

            @Override
            public void sleep() {
                System.out.println("Sleeping");
            }
        };
        cat.eat();
        cat.sleep();


    }
}
