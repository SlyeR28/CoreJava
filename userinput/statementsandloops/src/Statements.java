import java.util.Scanner;

public class Statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        String name;
        boolean isstudent;

        System.out.print("enter your name :");
        name = sc.nextLine();
        System.out.print("enter your age : ");
        age = sc.nextInt();
        System.out.print("are you a isstudent (true/false) : ");
        isstudent = sc.nextBoolean();

        //group1
        if(name.isEmpty()){
            System.out.println("you didn't enter your name 😡");
        }else{
            System.out.println("hello " + name + "! 😊");
        }

        //group2
        if(age>=65){
            System.out.println("you are a senior 👴");
        } else if (age>=18) {
            System.out.println("you are an adult 🧑");
        } else if (age<0) {
            System.out.println("you haven't born yet! 👼");
        } else if (age == 0) {
            System.out.println("you just have born baby🤱");
        }else {
            System.out.println("you are a baby");
        }

        //group3
        if(isstudent){
            System.out.println("you are a student 🧑‍🎓");
        }else {
            System.out.println("you are not a student 👨‍🦰");
        }


        sc.close();;
    }
}
