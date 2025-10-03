import java.util.Scanner;
public class Income {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary;

        System.out.print("enter your monthly income : ");
        salary = sc.nextInt();

        double taxrate = (salary > 60000) ? 0.25 : 0.15;
        System.out.println(taxrate);

    }
}
