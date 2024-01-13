package Collection.HashMaps;

import java.util.*;

public class newWordsInversion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine().replace(",", " ").replace("?", " ");

        Map<Integer, List<String>> addWords = new HashMap<>();
        String[] word = words.split(" ");


        List<String>name ;
        String names;
        for (int i = 0; i < word.length ; i++) {
            names = word[i];
            name = new ArrayList<>();
            int totals = 0;

            for (int j = 0; j < word.length ; j++) {
                if (names.equals(word[j])) {
                    totals++;
                }
            }
            if (!addWords.containsKey(totals)) {
                name.add(names);
                addWords.put(totals,name);
            }else
                if (!addWords.get(totals).contains(names)) {
                    addWords.get(totals).add(names);


                }

        }
        System.out.println(addWords);

    }


}







