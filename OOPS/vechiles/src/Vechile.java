public class Vechile {
    private String Engine;
    private int  Wheels;
    private int  Seat;
    private int FuelTank;
    private String Lights;

    public Vechile() {
        Engine = "petrol";
        Wheels = 2;
        Seat = 2;
        FuelTank = 14;
        Lights = "LED";
    }

    public String getEngine() {
        return Engine;
    }

    public int getWheels() {
        return Wheels;
    }

    public int getSeat() {
        return Seat;
    }

    public int getFuelTank() {
        return FuelTank;
    }

    public String getLights() {
        return Lights;
    }
}
