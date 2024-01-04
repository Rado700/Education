package Collection.HashMaps;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<String, BigInteger>map = new HashMap<>();
        map.put("Ivan", BigInteger.valueOf(529551));
        map.put("Vasya",BigInteger.valueOf(991332));
        System.out.println(map);
        map.put("Ivar",BigInteger.valueOf(529555));
        map.putIfAbsent("Ivar2",BigInteger.valueOf(529555));
        System.out.println(map);
        System.out.println(map.get("Ivan"));
//        map.remove("Ivan");
        System.out.println(map);
        for (Map.Entry<String, BigInteger> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.containsKey("Ivan"));
    }
}
