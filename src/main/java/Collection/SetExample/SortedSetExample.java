package Collection.SetExample;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {
        SortedSet<String>sortedSet = new TreeSet<>();
        sortedSet.add("Hello");
        sortedSet.add("how are you");
        sortedSet.add("I'm Maikl");
        sortedSet.add("a,m");
        System.out.println(sortedSet);

         // ASCII
        char s = 'a';
        int sa = s;
        sa += 3;
        char p = (char) sa;
        System.out.println(p);

        char d = 'Ю';
        if (d >= 65 && d <= 90){
            d += 32;
        } else if (d >= 97 && d <= 122) {
            d -= 32;
        }else {
            System.out.println("Неверная буква");
        }

        System.out.println(d);


    }
}
