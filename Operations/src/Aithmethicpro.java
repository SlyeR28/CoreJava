public class Aithmethicpro {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;

        String n1 = "25";
        String n2 = "13";

        int sum = a + b;
        int  difference = a - b;
        int multiplication = a*b;
        double division = (double) a /b; // make sure in type conversion of int to double use(double);

         //type casting in Sting to int ;
        int A1 = Integer.parseInt(n1);
        int A2 = Integer.parseInt(n2);

        int SUM = A1 + A2;
        int DIFFERENCE = A1 -A2;
        int MULTIPLICATION = A1*A2;
        double DIVISION = (double)A1/A2;


        System.out.println("sum is " +sum);
        System.out.println("difference is" +difference);
        System.out.println("multiplication is " +multiplication);
        System.out.println("division is " +division);

        System.out.println("sum is " +SUM);
        System.out.println("difference is " +DIFFERENCE);
        System.out.println("multiplication is " +MULTIPLICATION);
        System.out.println("division is " +DIVISION);


    }
}
