package ArrayList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringLentghComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
      return o2.length() - o1.length();
    }

    public static void main(String [] args){
        List<String> words = Arrays.asList("Banana" , "Apple", "date" , "litchi" , "lemon" , "orange");
        words.sort(new StringLentghComparator());
        System.out.println(words);

    }
}
