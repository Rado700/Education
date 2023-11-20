package OOP.Static;

public class StudentManager {
    public static void main(String[] args) {


        Student student = new Student(1, "Andrey", 5);
        Student student2 = new Student(2, "Vanya", 4.5);

        System.out.println(Student.StudentCount());
        System.out.println(Student.getAverage());


    }
}
