package Collection.HashMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PlayList {
    public static void main(String[] args) {
        Map<String, Double>duration = new HashMap<>();
        duration.put("song1",2.1);
        duration.put("song2",2.3);
        duration.put("song3",2.0);

        double two = 0;
        for (Map.Entry<String, Double> total: duration.entrySet()  ){
            two += total.getValue();

        }
        System.out.println(two);
    }
}
