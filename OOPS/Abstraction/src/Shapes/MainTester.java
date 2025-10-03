package Shapes;
import java.util.Scanner;
public class MainTester {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

   //  CIRCLE
        System.out.println("Enter the radius of circle: ");
        double radius = sc.nextDouble();
        Shapess circle = new circle(radius);
        circle.displaydetals();
        System.out.println("Circle Area : " +circle.calculatearea());
        System.out.println("Circle perimeter : " +circle.calculateperimeter());

  //      Reactangle
        System.out.println("Enter the length of reactangle :");
        double length = sc.nextDouble();
        System.out.println("Enter the breath of reactangle :");
         double breath = sc.nextDouble();
         Reactangle reactangle = new Reactangle(length , breath);
         reactangle.displaydetals();
        System.out.println("reactangle area is: " +reactangle.calculatearea());
        System.out.println("reactangle perimeter is: " +reactangle.calculateperimeter());

        //Triangle
        System.out.println(" \n Enter the sides of :" );
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        if(side1+side2 >side3 && side1+side3 >side2 && side3+side2 >side1){
            Traingle traingle = new Traingle(side1,side3,side2);
            traingle.displaydetals();
            System.out.println("area of Triangle is : "+ traingle.calculatearea());
            System.out.println("perimeter of triangle is : " +traingle.calculateperimeter());
        }else{
            System.out.println("invalid triangle......");
        }
        sc.close();
    }
}
