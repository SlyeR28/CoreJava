import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = 0;
        System.out.println("enter your age");
        age = sc.nextInt();

        while(age<0){
            System.out.println("you didn't have enter the world till now : lol ");
            System.out.println("enter your age : ");
            age = sc.nextInt();

        }
        System.out.println("you are " +age + "years old");
        sc.close();
    }
}
