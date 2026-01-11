package Map;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {

        Map<day , String > map = new EnumMap<>(day.class);


    }



    enum day{
        MONDAY , TEAUSADAY , WEDNESDAY , THURSDAY , FRIDAY , SATURDAY , SUNDAY
    }
}
