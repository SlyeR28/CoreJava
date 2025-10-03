public abstract class Payment {
    protected double Amount;

     protected Payment(double amount) {
       this.Amount = amount;
    }
    public abstract void processPayemnt();


     public void display(){
         System.out.println("Processing payment of amount " +Amount);
     }
}
