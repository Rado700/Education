package Collection.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class FurnitureStore {
    public static void main(String[] args) {
        Map<String, Integer> furniture = new HashMap<>();
        furniture.put("Кровать" , 234);
        furniture.put("Стул", 72634);
        furniture.put("Стол" , 72346);

        // {234: {"price" : 500, "quantity" : 3}}
        Map<Integer, Map<String, Integer>> priceList = new HashMap<>();
        Map<String, Integer> temp = new HashMap<>();
        temp.put("price", 5000);
        temp.put("quantity", 3);
        priceList.put(234, temp);
        System.out.println("1"+temp);

        temp = new HashMap<>();
        temp.put("price", 1000);
        temp.put("quantity",10);
        priceList.put(72634, temp);
        System.out.println("2"+temp);

        temp = new HashMap<>();
        temp.put("price",1500);
        temp.put("quantity", 20);
        System.out.println("3"+temp);
        priceList.put(72346,temp);
        int total = 0;

//        for (Map.Entry<String,Integer> pp : furniture.entrySet()) {
//            if (priceList.containsKey(pp.getValue())){
//                System.out.println(pp.getKey());
//
//                int two = priceList.get(pp.getValue()).get("price");
//                int one = priceList.get(pp.getValue()).get("quantity");
//                total  += two * one;
//
//
//            }
//        }
        int totals = 0;

        for (Map.Entry<String, Integer> newEntry : furniture.entrySet()){
            if (priceList.containsKey(newEntry.getValue())){
               int one = priceList.get(newEntry.getValue()).get("price");
                int two = priceList.get(newEntry.getValue()).get("quantity");
                totals = one * two;
                System.out.println(newEntry.getKey());
                System.out.println(totals);
            }
        }
//        int one = priceList.get(furniture.get("Кровать")).get("price");
//        int two = priceList.get(furniture.get("Кровать")).get("quantity");
//        totals = one * two;
//        System.out.println("Кровать");
//        System.out.println(totals);


    }
}
