package Collection.ListExample;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static List<String> listLinked () {

        List<String> linked = new LinkedList<>();
        linked.add("name");
        linked.add("family");
        linked.add("age");
        System.out.println(linked);
        linked.get(1);
        return linked;
    }


    public static void main(String[] args) {

        System.out.println(listLinked());
        System.out.println(listLinked().get(1));

    }

}
