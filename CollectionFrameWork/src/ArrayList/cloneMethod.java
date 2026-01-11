package ArrayList;

public class cloneMethod implements Cloneable{
    String name;
    int age;

    public cloneMethod(String name , int age ){
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "gfg{name : ' " +name +" ', age: "+ age + '}';
    }
}
