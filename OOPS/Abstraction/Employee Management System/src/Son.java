public class Son extends Parent{

    public Son(String name , int age){
        this.name = name;
        this.age = age;

    }
    public Son(){
    }


    @Override
    void career(String name) {
        System.out.println("i am going to be " +name);
    }

    @Override
    void partner(String name, int age) {

        System.out.println("i love " +name + "and she is  " + 34 + "years old" );
    }
}
