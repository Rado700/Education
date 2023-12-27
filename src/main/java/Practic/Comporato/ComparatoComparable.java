package Practic.Comporato;

import java.util.Collection;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class ComparatoComparable {
    public static void main(String[] args) {

//        String str = "Аргон";
//        String str2 = "Ааргон";
//        String str3 = "аргон";
//        String str4 = "аРгон";
//        String str5 = "АрГон";
//
//        String [] allStr = new String[]{str,str2,str3,str4,str5};
//        Arrays.sort(allStr);
//        for (String s : allStr) {
//            System.out.println(s);
//        }
//

        User user = new User("Antuan",24,"ass");
        User user1 = new User("Artur",25,"Ag");
        User user2 = new User("Robert", 23,"qss");
        User user3 = new User("Antuan",21,"sqw");
        User user4 = new User("Teimur",18,"uus");

        SortedSet<User>users = new TreeSet<>();
        users.add(user);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);


        System.out.println("до сравнивания");
        for (User s:users) {
            System.out.println(s);

        }
        System.out.println("после сравнивания");


        users.comparator();
        for (User s: users ) {
            System.out.println(s);

        }


    }
}
