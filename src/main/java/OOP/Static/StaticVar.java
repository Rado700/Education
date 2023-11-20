package OOP.Static;

import java.util.Arrays;

public class StaticVar {
    public static void main(String[] args) {
        Person person = new Person();
        Person person2 = new Person();
        Person person1 = new Person();
        System.out.println(Math.PI);

        System.out.println(Person.getCounter());

    }

}
