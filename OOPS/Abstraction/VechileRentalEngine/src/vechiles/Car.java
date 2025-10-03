package vechiles;

public class Car extends Vechile{



    public Car(int id, String model, double rentalRent) {
        super(id, model, rentalRent);
    }

    @Override
    public double calculateRent(int days) {
        double discount = (days>7)?0.9:1.0;
        return days*discount;
    }

    @Override
    public String getDetails() {
        return "Truck Id : " +id + "Model number : " +model;
    }
}
