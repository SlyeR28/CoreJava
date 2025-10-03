import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius;
        double circumfernce;
        double area;
        double volume;

        System.out.print("enter teh radius of circle : ");
        radius = sc.nextDouble();

        circumfernce = 2*Math.PI*radius;
        area = Math.PI*Math.pow(radius , 2);
        volume = (4.0/3.0)*Math.PI*Math.pow(radius , 3);

        System.out.println("the circumfrence of circle is :" + circumfernce +" units");
        System.out.println("the area of circle is : " +area + " unit²");
        System.out.println("the volume of circle is : " +volume + " unit³");

        sc.close();
    }
}
