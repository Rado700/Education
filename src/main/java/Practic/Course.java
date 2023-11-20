package Practic;

public class Course {
    public static void main(String[] args) {


        CourseForJava course = new CourseForJava("Java");

        Student2 student = new Student2("Antonio", 20);
        Student2 student2 = new Student2("Dima", 22);
        Student2 student3 = new Student2("Fedya", 21, 2);


        course.addStudents(student);
        course.addStudents(student2);

        course.historyForStudents();

    }
}
