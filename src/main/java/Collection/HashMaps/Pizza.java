package Collection.HashMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Map<String, Map<String, Integer>> allOrder = new HashMap<>();
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            String data = scanner1.nextLine(); // Name Pizza Amount
            String[] all = data.split(" ");
            String name = all[0];
            String pizza = all[1];
            Integer amount = Integer.valueOf(all[2]);

            if (allOrder.containsKey(name)){
                Map<String, Integer> order = allOrder.get(name);
                if (order.containsKey(pizza)){
                    amount += order.get(pizza);
                }
                order.put(pizza,amount);

            }else {
                Map<String, Integer> order = new HashMap<>();
                order.put(pizza, amount);
                allOrder.put(name, order);
            }

        }

        System.out.println(allOrder);

    }
}
