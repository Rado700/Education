package Collection.HashMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class newWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toLowerCase();
        Map<String, Integer> words = new HashMap<>();

        int values = 0;

        String[] one = word.split(" ");

        for (int i = 0; i < one.length; i++) {


            if (!words.containsKey(one[i])) {
                words.put(one[i], 1);

            } else if (words.containsKey(one[i])) {
                int currentValue = words.get(one[i]);
                words.put(one[i], currentValue +1);
            }
        }
        System.out.println(words);
        System.out.println();
    }

}
