import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("enter the number : ");
        number = sc.nextInt();

        String EvenOrOdd = (number % 2 == 0)? "Even" : "odd";
        System.out.println(EvenOrOdd);

    }
}
