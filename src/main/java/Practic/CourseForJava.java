package Practic;

import OOP.Student;

public class CourseForJava {

     String courseForStudents;
     int maxStudents = 3 ;
     Student2 [] newStudents = new Student2[maxStudents];

     public CourseForJava(String courseForStudents) {
          this.courseForStudents = courseForStudents;
          System.out.println("Добро пожаловать студента на курс по "+ courseForStudents );
     }

     public String addStudents(Student2 student){
          for (int i = 0; i <newStudents.length; i++) {
               if (newStudents[i] == null){
                    newStudents[i] = student;
                    return "Студент добавлен";
               }
          }
          return "На курсе больше нету места ";
     }

     public void historyForStudents(){
          for (int i = 0; i < newStudents.length; i++) {
               if (newStudents[i] != null){
                    System.out.println(newStudents[i]);
               }
          }
     }

}
