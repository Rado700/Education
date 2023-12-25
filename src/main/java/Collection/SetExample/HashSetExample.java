package Collection.SetExample;

import OOP.References.Example.Person;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("people");
        set.add("human");
        boolean isAdded = set.add("human");
        System.out.println(isAdded);
        System.out.println(set);
        System.out.println(set.size());
        for (String s : set){
            System.out.println(s);
        }
        set.remove("human");
        System.out.println(set);

        Set<Person>people = new HashSet<>();
        people.add(new Person("Timur",22));
        people.add(new Person("Timur",23));
        people.add(new Person("Timur",23));

        System.out.println(people);
    }
}
