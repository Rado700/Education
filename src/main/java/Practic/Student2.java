package Practic;

public class Student2 {

    protected String name;
    protected int age;
    protected int course;

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student2(String name, int age, int course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public String toString() {
        if (course == 0) {
            return "Имя студента " + name + ", лет студенту" + age + ", курс студента";
        }else
            return "Имя студента " + name + "," + age +", лет студенту" + ", курс студента "+ course;
    }
}