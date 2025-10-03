import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        double amount = sc.nextDouble();

        System.out.println("Select your payment method : 1..credit card 2.. Debit card 3..Upi");
        int choice = sc.nextInt();

        Payment payment;
        switch (choice){
            case 1 :
                payment = new CreditCard(amount);
                break;
            case 2:
                payment = new DebitCard(amount);
                break;
            case 3:
                payment = new UpiPayemnt(amount);
                break;
            default:
                System.out.println("Default choice..");
                sc.close();
                return;
        }
        payment.processPayemnt();
        sc.close();
    }
}
