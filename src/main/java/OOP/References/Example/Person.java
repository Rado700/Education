package OOP.References.Example;

import java.util.HashMap;
import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person clone() {
        return new Person(name, age);
    }


    @Override
    public int hashCode() {
        System.out.println(name.hashCode() + age);
        return name.hashCode() + age;

    }

    @Override
    public boolean equals(Object obj) {
        return Objects.equals(name, ((Person) obj).name) && age == ((Person) obj).age;
    }
}
