package variables;

import java.math.BigInteger;
import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {

//     // Факториал числа
//        public static BigInteger factorial(long value){
//            BigInteger result = BigInteger.ONE;
//            for (int i = 1; i <= value; i++) {
//                result = result.multiply(BigInteger.valueOf(i));
//            }
//            return result;
//        }

//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        if (a > b){
//            System.out.println(a);
//        }
//        else System.out.println(b);
//
//        Scanner scanner2 = new Scanner(System.in);
//        int year = scanner2.nextInt();
//        int b100 = year / 4;
//        int c = year / 100;
//        int d = year / 400;
//        int total = b100 - c + d;
//        System.out.println(total);


//        Scanner scanner = new Scanner(System.in);
//        int year = scanner.nextInt();
//        if (year %4 == 0&&year %100 !=0 || year %400 ==0){
//            System.out.println("Yes");
//
//        }else System.out.println("No");

//
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        int computer;
//        int person;
//
//        System.out.println("Введи свой xод:");
//        System.out.println("1 это камень");
//        System.out.println("2 это ножницы");
//        System.out.println("3 это бумага");
//
//        person = scanner.nextInt();
//
//        computer = random.nextInt(3);
//        System.out.println(computer);
//
//        if (person ==computer)
//            System.out.println("ничья");
//
//        else if (person == 1 && computer == 2 || person == 2 && computer ==3 || person == 3 && computer == 1 )
//            System.out.println("win");
//
//        else
//            System.out.println("loss");


//
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        int d = scanner.nextInt();
//
//        if ( a == c || b == d){
//            System.out.println("Yes");
//
//        }
//        else  {
//            System.out.println("No");
//        }
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        int e = scanner.nextInt();
//        int f = scanner.nextInt();

//        if (a >= b && a >= c)
//            System.out.println(a);
//        else if (b >= c && b >= a) {
//            System.out.println(b);
//
//        } else System.out.println(c);
//        System.out.println(Math.max(a,Math.max(b,Math.max(c,Math.max(e,f)))));


//       Scanner scanner = new Scanner(System.in);
//
//        System.out.println(" Введите число :");
//       int a = scanner.nextInt();
//       System.out.println("Введите второе число:");
//       int b = scanner.nextInt();
//        System.out.println("Введите третье число:");
//        int c = scanner.nextInt();
//        System.out.println("");
//
//
//        if (a %2 ==0 || b % 2 == 0 || c%2 == 0 ){
//            System.out.println("YES");
//        }
//
//        // Дописать какое число равняется,
//
//
//        else if (a%2 != 0 && b != 0 && c != 0) {
//
//
//            System.out.println(" NO");
//        }
//

//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();//2
//        int b = scanner.nextInt();//5
//        int c = scanner.nextInt();//0
//        int d = scanner.nextInt();//2
//
//
//
//        for (int i = a; i <= b  ; i++) {
//            if (i % d == c){
//                System.out.println("i = " + i);
//            }
//
//        }

//
//        int n = 15;
//
//        for (int i = 1 ; i <= n; i++ ) {
//            int coll = i*i;
//
//            if (coll <= n){
//                System.out.println(coll);
//            }
//
//        }


//
//        Scanner scanner = new Scanner(System.in);
//
//        String arr = "1 2 3 5 6 8 5 9";
////        String arr = scanner.nextLine();
//        Scanner scanner1 = new Scanner(arr);
//        int min_index;
//
//        for (int i = 0; i < arr.length(); i++) {
//
//
//               min_index = i;
//
//                for (int j = i + 1; j < arr.length(); j++) {
//                    if (j < min_index) {
//                        min_index = j;
//                    }
//                }
//                // Swap current index with minimum element in rest of list
//                int temp = min_index;
//                min_index = i;
//                i = temp;
//            }


//String str = "10 20 40 60";
//Scanner scanner = new Scanner(str);
//int a = scanner.nextInt();//10
//int b = scanner.nextInt();//20
//        System.out.println(a + b);



                // вывод кол во слов с пробелами
        String str = "Собеседование       прошло очень успешно, вопросы были не сложные";
        String array[] = str.trim().replaceAll("\\s{3,}"," ").split(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);}
            System.out.println("Количество слов = " + array.length);




//        //Премоугольник
//
//
//        int height = 10;
//        int width = 20;
//        int row = 1;
//        while (row <= height){
//            int coloumn = 1;
//            while(coloumn<= width){
//                if (row == 1 || row == height || coloumn == 1 || coloumn == width){
//                    System.out.print("Б");
//                }else {
//                    System.out.print(" ");
//                }
//                coloumn ++;
//            }
//            System.out.println();
//            row++;
//        }

        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (scanner.hasNextInt()){
            int x = scanner.nextInt();
            if (x % 2 == 0 && x > max){
                max = x;
            }
        }
        System.out.println(max);




    }

}













