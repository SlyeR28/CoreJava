import java.sql.SQLOutput;
import java.util.Scanner;
public class AMoRPM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int hours;

        System.out.print("enter the hours :");
        hours = sc.nextInt();

        String dayornight = (hours < 12)? "AM" : "PM";
        System.out.println(dayornight);
    }
}
