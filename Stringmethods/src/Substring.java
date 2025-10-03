import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String gmail;
        String username;
        String domain;

        System.out.print("enter your gmail: ");
        gmail = sc.nextLine();

        if(gmail.contains("@")){
            username = gmail.substring(0 , gmail.indexOf('@'));
            domain = gmail.substring(gmail.indexOf('@'));

            System.out.println(username);
            System.out.println(domain);
        }else {
            System.out.println(" you didn't enter the correct gmail ");
        }



        sc.close();
    }
}
