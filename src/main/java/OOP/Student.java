package OOP;

public class Student {

    String name;
    int age;

    double grade;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        if (grade == 0) {
            return ("Имя студента " + name + " Возраст студента: " + age);
        } else
            return ("Имя студента " + name + " Возраст студента: " + age + " Оценка студента " + grade);
    }
}
