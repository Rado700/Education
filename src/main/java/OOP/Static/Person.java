package OOP.Static;

import java.util.UUID;

public class Person {

    private final UUID id;
    private static int counter = 0;

    static {
        counter = 105;
        System.out.println("static init");
    }

    public Person() {
        id = UUID.randomUUID();
        counter++;
    }

    public static int getCounter(){
        return counter;
    }

}
