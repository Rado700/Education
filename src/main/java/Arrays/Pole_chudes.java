package Arrays;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Pole_chudes {
    public static void main(String[] args) {

        // Дополнить - чтоб при слове подсказка он рандомно высвечивает одну не раскрытую букву

        Scanner scanner = new Scanner(System.in);
        String [] slova = {"яблоня", "абсурд","гадать"};
        Random random = new Random();
        int x = random.nextInt(slova.length);
        String coll = slova[x];
        String [] slovo = new String[coll.length()];
        for (int i = 0; i < coll.length(); i++) {
            slovo[i] = "_";
        }

        System.out.println(Arrays.toString(slovo));
        do {
            System.out.println("Введите вашу букву:");
            String s = scanner.next();
            if (Objects.equals(s, "подсказка")){ //s.equals("подсказка")
                // Выбираем рандомное число(Индекс) Если по этому индексу уже откурыта буква мы прегенерируем число
                // иначе мы открываем по этому индексу
            }
            else if (s.length() > 1) {
                System.out.println("Не подходит");
            } else {
                for (int i = 0; i < coll.length(); i++) {
                    if (coll.charAt(i) == s.charAt(0)) {
                        slovo[i] = s;
                    }
                }
                System.out.println(Arrays.toString(slovo));
            }
            int count_undr = 0;
            for (int i = 0; i < slovo.length; i++) {
                if (Objects.equals(slovo[i], "_")){
                    count_undr ++;
                }
            }
            if (count_undr == 0)
                break;



        }while (true);
        System.out.println("Игра завершена");
//
    }
}
