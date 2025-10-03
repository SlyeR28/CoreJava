package vechiles;

public class Truck extends Vechile{


    public Truck(int id, String model, double rentalRent) {
        super(id, model, rentalRent);
    }

    @Override
    public double calculateRent(int days) {
        return rentalRent*days;
    }

    @Override
    public String getDetails() {
        return "Truck Id : " +id + " Model number :" +model;
    }
}
