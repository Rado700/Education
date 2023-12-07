package Collection.ListExample;

import java.util.Set;

public class LinkedHashSet {
    public static void main(String[] args) {
        Set<String>set = new java.util.LinkedHashSet<>();
        set.add("petya");
        set.add("vova");
        set.add("Jeka");

        System.out.println(set);
    }
}
