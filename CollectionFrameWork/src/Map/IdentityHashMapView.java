package Map;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapView {
    public static void main(String[] args) {
        String k1 = new String("key");
        String k5 = new String("key1");
        String k3 = new String("key2");
        String k6 = new String("key3");
        String k2 = new String("key4");
        String k4 = new String("key5");

        Map<String , Integer> identitymap = new IdentityHashMap<>();
        identitymap.put(k1 , 78);
        identitymap.put(k2 ,98);
        identitymap.put(k3 ,98);
        identitymap.put(k4 ,98);
        identitymap.put(k5 ,98);
        identitymap.put(k6 ,98);

        System.out.println(identitymap);
    }
}
