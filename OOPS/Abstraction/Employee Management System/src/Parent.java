abstract class Parent {

    int age;
    String name;

    abstract void career(String name);
    abstract void partner(String name, int age);



    @Override
    public String toString() {
        return "Parent{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
