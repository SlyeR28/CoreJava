import java.util.Scanner;
public class userinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        String name;

        System.out.print("enter your age: ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("whats your name : ");
        name = scanner.nextLine();

        System.out.println("hello myself " +name + " and i am " +age + " years old");
        scanner.close();

    }

}
