import vechiles.Bike;
import vechiles.Car;
import vechiles.Truck;


public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck(245 , "Mahidra" , 4500);
        System.out.println(truck.calculateRent(5));
        System.out.println(truck.getDetails());

            Car car = new Car(456 , "Audi" , 3200);
        System.out.println(car.calculateRent(12));
        System.out.println(car.getDetails());

        Bike bike = new Bike(23 , "Hero honda" , 1200);
        System.out.println(bike.calculateRent(12));
        System.out.println(bike.getDetails());
    }
}