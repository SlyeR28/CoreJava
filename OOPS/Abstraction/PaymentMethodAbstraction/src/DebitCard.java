public class DebitCard extends Payment{

    public DebitCard(double amount){
         super(amount);
    }

    @Override
    public void processPayemnt() {
        display();
        System.out.println("Payment processed by Debit Card..");
    }
}
