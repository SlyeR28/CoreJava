import java.util.Scanner;
public class trenaryoperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score;
        System.out.print("enter the score : ");
        score = sc.nextInt();
//        if(score > 60){
//            System.out.println("Pass");
//        }else {
//            System.out.println("Fail");
//        }
      String PassOrFail = (score >= 60) ? "Pass" : "Fail";
        System.out.println(PassOrFail);
        sc.close();
    }
}
