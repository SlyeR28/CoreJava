import java.util.ArrayList;

public class Mainn {
    public static void main(String[] args) {
        try{
            cloneMethod o1 = new cloneMethod("Ram" , 34);
            cloneMethod o2 = (cloneMethod) o1.clone();
            System.out.println("original" + o1);
            System.out.println("cloned" + o2);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("apple");
        list2.add("pineapple");
        list2.add("grapes");
        list2.add("mango");
        list2.add("litchi");
        list2.add("litchi");
        list2.add("litchi");

//        list2.forEach(System.out::println);
        System.out.println(list2);
    }
}

