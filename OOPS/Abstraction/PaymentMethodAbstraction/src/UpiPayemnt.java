public class UpiPayemnt  extends Payment{
    public UpiPayemnt(double amount){
        super(amount);
    }

    @Override
    public void processPayemnt() {
    display();
        System.out.println("Payment is processed by Upi :");
    }
}
