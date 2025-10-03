import java.util.Random;  //used for only integer and boolean datatypes
public class Randomnumbers {
    public static void main(String[] args) {
        Random random = new Random();
        boolean ishead;

        ishead = random.nextBoolean();
        System.out.println(ishead);
    }
}
