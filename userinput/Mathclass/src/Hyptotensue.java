import java.util.Scanner;

public class Hyptotensue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;

        System.out.print("enter the length of a : ");
        a = sc.nextDouble();
        System.out.print("enter the length of b : ");
        b = sc.nextDouble();

        c = Math.sqrt(Math.pow(a , 2) + Math.pow(b, 2));

        System.out.println("the lentgh of hypotensue  is " +c + " unit");

        sc.close();
    }
}
