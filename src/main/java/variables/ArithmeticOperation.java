package variables;

import java.util.Arrays;
import java.util.Scanner;

public class ArithmeticOperation {


    public static void main(String[] args) {

        // нахождения минимального числа

//        int x = scanner.nextInt();
//        int min = Integer.MAX_VALUE;
//        if (x <min){
//            min = x;
//        }
//        System.out.println(min);


        // нахождения максимального числа

//        int y = scanner.nextInt();
//        int max = Integer.MIN_VALUE;
//        if (y > max){
//            max = y;
//        }
//        System.out.println(max);
//
//        Scanner scanner = new Scanner(System.in);
//        int rub = scanner.nextInt(); // 10
//        int cop =scanner.nextInt(); // 15
//        int n = scanner.nextInt(); // 2
//
//        int totalColl = rub * 100 + cop; // сколько копеек стоит 1 пирог
//        int totalNCop = n * totalColl; // 2030
//        long resultRub = totalNCop/100 ;
//        long resiltCop = totalNCop%100;
//        System.out.println("resiltCop = "+ resultRub +"."+ resiltCop);

//
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt(); // x = 1790
//        int first_num = x / 1000;
//        int second_num = x % 1000 /10 ;
//        int third_num = x % 100 ;
////
//        System.out.println(second_num);


//        int num = 8;
//        switch (num){
//            case 1:
//                System.out.println(" not found");
//                break;
//            case 8:
//                System.out.println("number is catch");
//                num++;
//            case 9:
//                System.out.println("number with 9");
//        }
//
//

//        int n = 10;
//        for (int i = 0, j = n - 1; i < j; i++, j--) {
//            System.out.println(i * j);
//        }
//

//        int x = 5;
//        int y = 4;
//        int z = x<y? (x+y):(x-y);     /// вопрос по минусу
//        System.out.println(z);
//

//        int j = 7;
//        do {
//            System.out.println(j);
//            j--;
//        }
//        while (j>0);
//   ----------------------------
//        int j2 = 6;
//        while (j2 > 0) {
//            System.out.println("j2 = " + j2);
//            j2--;
//        }

//        for (int i = 0; i <10; i ++){
//            if (i == 5)continue;
//
//            System.out.println("i = " + i);
//
//        }

        // Последовательность чисел по факториалу числа

//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//
//        int number = 1;
//        int count = 1;
//        for (int i = 0; i < x; i++) {
//            System.out.println(number);
//            count--;
//            if (count == 0) {
//                number++;
//                count = number;
//            }
//        }

        // Нахождение второй по минимальной последовательности

        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        while (scanner.hasNextInt()){
            int s = scanner.nextInt();
            if (s < min){
                secondMin = min;
                min  = s;
            }else if (s > min && s < secondMin){
                secondMin = s;
            }
        }


    }

}
