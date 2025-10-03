package Shapes;

public class Traingle extends Shapess{
    private double side1;
    private double side2;
    private double side3;

    public Traingle(double side1, double side3, double side2) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculatearea() {
        double s = (side1 + side2 +side3)/2;
        return Math.sqrt(s*(s-side1) *(s-side2)*(s-side3));
    }

    @Override
    public double calculateperimeter() {
        return side1 + side2 + side3;
    }
}
