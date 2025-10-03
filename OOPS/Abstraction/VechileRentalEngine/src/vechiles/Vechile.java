package vechiles;

public abstract class Vechile {
    protected int id;
    protected String model;
    protected double rentalRent;

    protected void vechileIsrunning(){
        System.out.println("Vechile is running");
    }
    protected void vechileIsStopped(){
        System.out.println("Vechile is stopped");
    }



    abstract double calculateRent(int days);
    abstract String getDetails();


     protected Vechile(int id, String model, double rentalRent) {
        this.id = id;
        this.model = model;
        this.rentalRent = rentalRent;
    }

    public int getId() {
        return id;
    }

}
