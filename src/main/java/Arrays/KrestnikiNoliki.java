package Arrays;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class KrestnikiNoliki {

    static String[][] field = new String[3][3]; // [["-", "X", "-"],[],[]] field[1][1] = "X"

    public static void createField() {     //Создания
        String s = "_";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) { // 0 0, 0 1, 0 2, 1 0
                field[i][j] = s;

            }

        }
    }

    public static void soutField() {
        // X O X
        // O X O
        // O O O
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) { // 0 0, 0 1, 0 2, 1 0
                System.out.print(field[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();

    }

    public static void hodIgroka() {
        Scanner scanner = new Scanner(System.in);

        int x, y;
        do {
            System.out.print("Введите ваш ход:");
            x = scanner.nextInt()-1;
            y = scanner.nextInt()-1;
        } while (x > 2 || x < 0 || y > 2 || y < 0 || !field[x][y].equals("_"));

        field[x][y] = "X";

    }

    public static void hodComputer() {
        System.out.println("Ход компьютера:");
        Random computer = new Random();
        int x, y;
        do {
            x = computer.nextInt(3);
            y = computer.nextInt(3);


        } while (!Objects.equals(field[x][y], "_"));
        field[x][y] = "O";
    }

    public static String End() {

        String[] XO = {"X", "O"};
        for (String p : XO) {
            for (int i = 0; i < 3; i++) {
                if (field[i][0].equals(p) && field[i][1].equals(p) && field[i][2].equals(p)) {
                    return p;
                }

            }
            for (int j = 0; j < 3; j++) {
                if (field[0][j].equals(p) && field[1][j].equals(p) && field[2][j].equals(p)) {
                    return p;
                }
            }
            if (field[0][0].equals(p) && field[1][1].equals(p) && field[2][2].equals(p)) {
                return p;
            }
            if (field[0][2].equals(p) && field[1][1].equals(p) && field[2][0].equals(p)) {
                return p;
            }
        }
        for (int i = 0;i < 3;i++){
            for (int j = 0;j<3;j++){
                if (field[i][j].equals("_")){
                    return "";
                }
            }
        }
        return "Ничья";


    }

    public static void main(String[] args) {
              System.out.println();
        String result = "";
        createField();
        soutField();
        do {
            hodComputer();
            soutField();
            result = End();
            if (!result.equals("")) {
                break;
            }
            hodIgroka();
            soutField();
            result = End();


        } while (result.equals(""));
        System.out.println(result);
    }
}
