package OOP;

public class Course {
    String courseForJava;
    int maxHumansCourse = 3;
    Student[] studentsCourse = new Student[maxHumansCourse];


    public Course(String courseForJava) {
        this.courseForJava = courseForJava;
        System.out.println("Поздравляем вновь поступивших на наш новый курс по " + courseForJava);
    }


    public String addStudents(Student student) {

        for (int i = 0; i < maxHumansCourse; i++) {                    // Добавляем студентов
            if (studentsCourse[i] == null){
                studentsCourse[i] = student;
                return "Добавлен один студент";
            }
        }
        System.out.println("Студенту "+ student.name + " Не хватило места" );
        return "Курс переполнен";
    }

    public void listForStudents() {
        int count = 0;
        for (int i = 0; i < maxHumansCourse; i++) {                  //Список студентов которые были добавлены
            if (studentsCourse[i] != null) {
                System.out.println("Студент: " + studentsCourse[i]);
                count++;
            }
        }
        System.out.println("Максимальное количество студентов " + maxHumansCourse + " чел" );
        System.out.println("Количество стедентов " + count + " чел");

    }
}