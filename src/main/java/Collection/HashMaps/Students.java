package Collection.HashMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Students {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        Map<String,String>nextStudent = new HashMap<>();

        String person = null;
        int num = scanner1.nextInt();

        for (int i = 0; i < num -1; i++) {
            String name = scanner.nextLine();
            String [] nameStudent = name.split(" ");

            String std1 =nameStudent[0];
            String std2 = nameStudent[1];

            nextStudent.put(std2,std1);
        }

        for (String name :nextStudent.keySet()) {
            if (!nextStudent.containsValue(name)){
                person = name;

            }
        }
        System.out.println(person);

        for (int i = 0; i < num - 1; i++) {
            person = nextStudent.get(person);
            System.out.println(person);
        }
        System.out.println(nextStudent);
    }
}
//Petr Mariya
//Ivan Liza
//Mariya Ivan
//Igor Petr