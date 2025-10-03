import java.util.Scanner;
public class Working {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";

        while(name.isEmpty()){
            System.out.print("enter your name : ");
            name = sc.nextLine();
        }
        System.out.println("hello my name is " +name);
    }
}
