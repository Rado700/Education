package OOP;

public class CorseForJava {
    public static void main(String[] args) {
        Course course = new Course("Java");
        Student students = new Student("Anton", 20);
        Student students2 = new Student("Artur",21);
        Student students3 = new Student("Timur",22,4.8);
        Student student4 = new Student("Vitalii",23,4.5);
        Student student21 = new Student("kolya",22);





//        students2.age = 21;
//        students2.name = "Artur";
//        System.out.println(students2);


        course.addStudents(students);
        course.addStudents(students2);
        course.addStudents(students3);
        course.addStudents(student4);
        course.addStudents(student21);


        System.out.println("Список студентов: ");
        course.listForStudents();






    }
}
