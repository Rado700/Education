package Collection.HashMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class newWordsInversion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine().replace(",", " ").replace("?", " ");

        Map<Integer, String> addWords = new HashMap<>();
        String [] word = words.split(" ");


        int totals = 0;

        for (int i = 0; i < word.length; i++) {
            if (!addWords.containsValue(word[i])) {
                addWords.put(i, word[i]);

            } else if (addWords.containsValue(word[i])) {
                int current = Integer.parseInt(word[i]);
                addWords.put(current + 1, word[i]);
            }

        }
        System.out.println(addWords);
    }

}

