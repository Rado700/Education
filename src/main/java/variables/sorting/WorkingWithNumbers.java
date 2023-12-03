package variables.sorting;

import java.util.Scanner;

public class WorkingWithNumbers {

    // угадай цифру
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        int computer = random.nextInt(10);
//        int a ;
//        int pop = scanner.nextInt();
//        int chet =1;
//        do {
//            a = scanner.nextInt();
//            chet += 1;
//
//            if (a < computer){
//                System.out.println("Меньше");
//            }
//            else if (a > computer){
//                System.out.println("Больше");
//
//            }else System.out.println("Попал");
//
//        }while (a != computer && pop >= chet);
//        if (pop < chet){
//            System.out.println("Попытки закончились");
//        }


    //      решить с циклом while (если число больше предыдущего выводим на экран кол-во разницы)

//        Scanner scanner = new Scanner(System.in);
//        int one = scanner.nextInt();
//        int sum = 0;
//        int total = 0;
//        int equals = 0;
//
//        do {
//            sum += one;
//            one--;
//            if (sum > one)
//                equals++;
//
//        }
//            while (one != 0) ;
//
//
//                System.out.println(equals);


    // выстраивание порядка цифр ( 1 2 2 3 3 3 4 4 4 4 ..)

//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//
//        int number = 1;
//        int count = 1;
//        if (x < 10000) {
//            for (int i = 0; i < x; i++) {
//                System.out.println(number);
//                count--;
//                if (count == 0) {
//                    number++;
//                    count = number;
//                }

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
//
//    Scanner scanner = new Scanner(System.in);
//    int min = Integer.MAX_VALUE;
//    int secondMin = Integer.MAX_VALUE;
//
//        while (scanner.hasNextInt()){
//        int s = scanner.nextInt();
//        if (s < min){
//            secondMin = min;
//            min  = s;
//        }else if (s > min && s < secondMin){
//            secondMin = s;
//        }
//    }


}
