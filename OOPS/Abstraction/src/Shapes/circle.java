package Shapes;

public class circle extends Shapess{
    private double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatearea() {
        return Math.PI*Math.pow(radius ,2);
    }

    @Override
    public double calculateperimeter() {
   return   2*Math.PI*radius;
    }

    @Override
    public void displaydetals() {
        super.displaydetals();

    }
}
