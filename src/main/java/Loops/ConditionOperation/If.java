package Loops.ConditionOperation;

import java.util.Arrays;
import java.util.Random;

public class If {
    public static void main(String[] args) {


//        int nums [] = {1,22,5,7,22,10};
//        int sum = 0;
//        for (int num = 1; num <= nums.length; num++) {
//            sum += num;
//        }
//
//        for (int num : nums) {
//            sum -= num;
//        }
//        System.out.println(sum);

//        //    //Второй вариант
//    int min = -15;
//    int max = 15;
//    int []mas = new int[10];
//        for (int i = 0; i < mas.length; i++) {
//            mas[i] = (int) (Math.random()* ((min - max))- min);
//        }
//        System.out.println(Arrays.toString(mas));
//
//    }
//
//        int mainM[] = new int[10];
//
//        int min2 = -15;
//        int max2 = 15;
//        int j = 0;
//
//        int mas1[] = new int[mainM.length / 2];
//        int mas2[] = new int[mainM.length / 2];
//        int pos[] = new int[10];
//        int odd[] = new int[10];
//        for (int i = 0; i < mainM.length; i++) {
//            mainM[i] = (int) (Math.random() * ((min2 - max2)) + max2);
//            System.out.println(Arrays.toString(new int[]{mainM[i]}));
//
//            if (i < mainM.length / 2) {
//                mas1[i] = mainM[i];
//            } else {
//                mas2[j++] = mainM[i];
//            }
//            if (mainM[i] > 0) {
//                pos[i] = mainM[i];
//            }
//            if (mainM[i] % 2 != 0) {
//                odd[i] = mainM[i];
//            }
//        }
//        System.out.println(Arrays.toString(mainM));
//        System.out.println(Arrays.toString(mas1));
//        System.out.println(Arrays.toString(mas2));


        int maxx = 15;
        int min = -15;
        int q = 0;

        int[] mass = new int[10];
        int[] one = new int[mass.length / 2];
        int[] two = new int[mass.length / 2];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random()*(maxx-min)+min);

            if (i < mass.length/2 ){
                one [i] = mass[i];
            } else
                two[q] = mass[i];


        }
        System.out.println(Arrays.toString(mass));
        System.out.println(Arrays.toString(one));
        System.out.println(Arrays.toString(two));

    }

//        int a = 5;
        // if - если
        // else - иначе
//        if (a > 1){
//            System.out.println("OK");
//        } else if (a == 1){
//            System.out.println("SO-so");
//        } else{
//            System.out.println("Bad");
//        }
//        int a = 42;
//        if  (a >= 40){
//            a = -1;
//        }
//        else if (a < 0){
//            a = 100500;
//        }
//        System.out.println(a);


//        int a = 42;
//        if  (a >= 40){
//            a = -1;
//        }
//        if (a < 0){
//            a = 100500;
//        }
//        System.out.println(a);
//
//
//        int[] numbers = {17, 6, 10, 20, 25};
//        int sum = 0;
//        for (int number : numbers) {
//            sum += number;
//        }
//        double average = (double) sum / numbers.length;
//        System.out.println("Среднее число average " + average);
//
//        System.out.println(sum);
//        //        return 0;

    }


