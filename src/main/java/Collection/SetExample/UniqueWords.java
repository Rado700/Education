package Collection.SetExample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        String newWord = word.replace(',',' ').replace('.',' ').replace('?',' ').replace('!', ' ');
        String[] splitWord = newWord.split(" ");
        System.out.println(Arrays.toString(splitWord));
        Set<String>words = new HashSet<>();
        for (int i = 0; i < splitWord.length; i++) {
            if (!splitWord[i].equals("")){
                words.add(splitWord[i]);
            }
        }
        System.out.println(words.size());

    }
}
