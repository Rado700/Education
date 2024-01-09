package Collection.HashMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class newWordsInversion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine().replace(",", " ").replace("?", " ");

        Map<String, Integer> addWords = new HashMap<>();
        String[] word = words.split(" ");

        int totals = 0;

        for (int i = 0; i < word.length - 1; i++) {

            if (!addWords.containsKey(word[i])) {
                addWords.put(word[i], i + 1);
            }

            for (int j = 1; j < word.length; j++) {
                if (addWords.containsKey(word[i]))
                    addWords.put(word[i], i + 1);
            }
        }
        System.out.println(addWords);
    }

}






