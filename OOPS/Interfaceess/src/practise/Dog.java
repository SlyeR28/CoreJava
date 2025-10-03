package practise;

public class Dog implements Animals{


    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is Sleeping");

    }

    public void sound(){
        System.out.println("who who whooooo");
    }
}
