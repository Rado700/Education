package Practic.skills;

import java.util.Arrays;

public class newSol {

    public static void main(String[] args) {

        // Соединение двух массивов

//        int [] first ={1,2,3,4,5};
//        int [] two = {6,7,8,9,10};
//        int [] result ;
//
//        result = new int [first.length + two.length];
//        for (int i = 0; i < first.length; i++) {
//            result[i] = first[i];
//
//        }
//        for (int i = 0; i < two.length; i++) {
//            result[first.length + i] = two[i];
//
//        }
//        System.out.println(Arrays.toString(result));


        // соединение двух массивов по сортировки из какого массива больше по нарастающей

 //       public static int[] mergeArrays ( int[] a1, int[] a2){
            int [] a1;
            int [] a2;
            a1 = new int[]{2, 3, -5, 1,4};
            a2 = new int[]{3, 17, -2, 7, -4,11};
            int[] result = new int[a1.length + a2.length];
            int pos1 = 0;
            int pos2 = 0;
            while (pos1 < a1.length || pos2 < a2.length) {
                result[pos1 + pos2] = (pos1 < a1.length && (pos2 == a2.length || a1[pos1] < a2[pos2]) ?
                        a1[pos1++] : a2[pos2++]);
            }
        System.out.println(Arrays.toString(result));




        // Соединение двух массивов через оператор While

            int [] x1 = {12,-2,33,41,11,111,125};
            int [] x2 = {4 , -11, 22, 42,222};

            int [] resul = new int[x1.length + x2.length];

            int pox1 = 0;
            int pox2 = 0;

            while (x1.length > pox1 || x2.length > pox2){
                resul[pox1 + pox2] = (x1.length > pox1 || (x2.length == pox2 )?
                        x1[pox1++] : x2[pox2++]);

            }
        System.out.println(Arrays.toString(resul));

    }


}

