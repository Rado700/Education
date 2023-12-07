package Practic.skills;

public class nameForArray {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};

        loops1:
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 3){
                System.out.println("Число " + array[i] + " меньше 3");

            }else {
                System.out.println("Цикл завершен");
                break loops1;
            }
        }
    }
}
