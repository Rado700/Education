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

        char d = 'a';
        if (d >= 65 && d <= 90){
            d += 32;
        } else if (d >= 97 && d <= 122) {
            d -= 32;
        }else {
            System.out.println("Неверная буква");
        }

        System.out.println(d);

        Pupil pupil = new Pupil("Anton",24);
        Pupil pupil1 = new Pupil("Robert", 27);
        Pupil pupil2 = new Pupil("Andrey",26);
        Pupil pupil3 = new Pupil("Timur", 23);
        Pupil pupil4 = new Pupil("Boris", 21);
        Pupil pupil5 = new Pupil("Timur",21);
        Pupil pupil6 = new Pupil("Timuro",24);

        SortedSet<Pupil>pupils = new TreeSet<>();
  //      SortedSet<Pupil>draft = new TreeSet<>();
        pupils.add(pupil);
        pupils.add(pupil1);
        pupils.add(pupil2);
        pupils.add(pupil3);
        pupils.add(pupil4);
        pupils.add(pupil5);
        pupils.add(pupil6);




        for (Pupil pi:pupils) {
                System.out.println(pi);

        }
        System.out.println(pupils.size());

    }
}
