import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

public class DeafultConst {
    private String Name;
    private int roll_no;
    private int ID_Card_no;
    private  float Marks;

    public DeafultConst() {
    }

    public DeafultConst(int ID_Card_no, float marks, String name, int roll_no) {
        this.ID_Card_no = ID_Card_no;
        Marks = marks;
        Name = name;
        this.roll_no = roll_no;
    }

    public int getID_Card_no() {
        return ID_Card_no;
    }

    public void setID_Card_no(int ID_Card_no) {
        this.ID_Card_no = ID_Card_no;
    }

    public float getMarks() {
        return Marks;
    }

    public void setMarks(float marks) {
        Marks = marks;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    @Override
    public String toString() {
        return "DeafultConst{" +
                "ID_Card_no=" + ID_Card_no +
                ", Name='" + Name + '\'' +
                ", roll_no=" + roll_no +
                ", Marks=" + Marks +
                '}';
    }


    @Override
    public int hashCode() {
        return Objects.hash(Name, roll_no, ID_Card_no, Marks);
    }

    public static void main(String[] args) {
        DeafultConst s1 = new DeafultConst();
        Class c1 = s1.getClass();
//        System.out.println(c1.getClassLoader());

        Method [] m = c1.getDeclaredMethods();
        for(Method method : m){
            System.out.println(method);
        }

        Field [] f = c1.getDeclaredFields();
        for(Field field : f){
            System.out.println(field);
        }
    }
}
