import java.util.Scanner;
public class Endless {
    public static void main(String[] args) {
//        while(1 == 1){
//            System.out.println("ypu are stuck ! help help");
//        }
        Scanner sc = new Scanner(System.in);
        String response = "";
        while(!response.equals("Q")){
            System.out.println("you are playing a game : ");
            System.out.print("enter Q to quit a game : ");
            response = sc.next().toUpperCase();
        }
        System.out.println("you have quit the game");
        sc.close();

    }
}
