package vechiles;


public class Bike extends Vechile{


    public Bike(int id, String model, double rentalRent) {
        super(id, model, rentalRent);
    }

    @Override
    public double calculateRent(int days) {
        double discount = (days>7)?12:15;
        return days*discount;
    }

    @Override
    public String getDetails() {
        return "Truck Id : " +id + " Model number : " +model;
    }
}
