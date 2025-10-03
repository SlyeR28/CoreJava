package Shapes;

public class Reactangle extends Shapess{
    private double length;
    private double breath;

    public Reactangle(double length, double breath) {
        this.length = length;
        this.breath = breath;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreath() {
        return breath;
    }

    public void setBreath(double breath) {
        this.breath = breath;
    }

    @Override
    public double calculatearea() {
        return length*breath;
    }

    @Override
    public double calculateperimeter() {
        return 2*(length +breath);
    }
}
