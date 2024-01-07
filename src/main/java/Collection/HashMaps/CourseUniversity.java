package Collection.HashMaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CourseUniversity {

    public static void main(String[] args) {

        CourseUniversity courseUniversity = new CourseUniversity();

        HashMap<String, String> course = new HashMap<>();
        course.put("М", "Математика");

        HashMap<String, String> course2 = new HashMap<>();
        course2.put("Ит1", "Информационная технология");
        course2.put("Ит2", "Информационная технология");

        courseUniversity.addNewCourse("Прикладная математика", course);         //course 1
        courseUniversity.addNewCourse("Информационные технологии", course2);    //course 2

 //       courseUniversity.editName("М", "Математ");

 //       courseUniversity.deleteCourse("Информационная технология", "Ит2");

 //       courseUniversity.showAll("Информационные технологии");
        courseUniversity.searchId("Ит1");

        System.out.println(courseUniversity.dataBase);
    }

    Map<String, Map<String, String>> dataBase = new HashMap<>();


    public CourseUniversity() {
        HashMap<String, String> course = new HashMap<>();
        course.put("ИФ1", "Информатика");
        dataBase.put("Информатика и вычислительная техника", course);
    }

    public void addNewCourse(String faculty, Map<String, String> newCourse) {
        dataBase.put(faculty, newCourse);

    }

    public void editName(String courseId, String courseName) {
        for (String namesFaculty : dataBase.keySet()) {
            if (dataBase.get(namesFaculty).containsKey(courseId)) {
                dataBase.get(namesFaculty).put(courseId, courseName);
            }
        }
    }

    public void deleteCourse(String facultyName, String courseId) {
        for (String nameCourse : dataBase.keySet()) {
            if (dataBase.get(nameCourse).containsValue(facultyName)) {
                dataBase.get(nameCourse).remove(courseId);
            }
        }
    }

    public void showAll(String faculty) {
        for (String name : dataBase.keySet()) {
            if (name.contains(faculty)) {
                System.out.println(dataBase.get(name));

            }

        }
    }

    public void searchId(String idCourse) {
        for (Map<String, String> search : dataBase.values()) {
            if (search.containsKey(idCourse)) {
                System.out.println(search.get(idCourse));

            }
        }
    }
}
