public class CreditCard extends Payment{

    public CreditCard(double amount){
        super(amount);
    }

    @Override
    public void processPayemnt() {
        display();
        System.out.println("Payment processed using credit card.");
    }

}
