import java.util.Scanner;

public class Stringbasic {
    public static void main(String[] args) {
        String name = "rishabh";
        int length = name.length();
        char letters = name.charAt(2);
        int index = name.indexOf("c");
        int lastindex = name.lastIndexOf("o");

        name = name.toUpperCase();
        System.out.println(name);

    }
}
