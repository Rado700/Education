package Collection.ListExample;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class TrainOrderStack {
    public static void main(String[] args) {

        System.out.println(wayStack("1,2,3,4,5"));


    }

    public static String wayStack(String way) {

        Stack<Integer> way2 = new Stack<>();
        Stack<Integer> stop = new Stack<>();


        boolean trainFirst = false;

        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        int[] x = new int[numbers];
        for (int i = 0; i < x.length; i++) {
            x[i] = scanner.nextInt();

        }
        for (int i : x) {
            way2.push(i);
        }
        for (int i = 0; i < x.length; i++) {

            if (stop.empty()) {
                way2.pop();
                way2.pop();
                stop = way2;
            } else if (way2.empty()) {

            }

        }
        return way;
    }
}


//        while (!trainFirst){
//            if (x.length > numbers){
//                trainFirst = false;
//
//            }
//        }


//    public boolean isDigitSequence(String sequence) {
//        for (int i = 0; i < sequence.length(); i++) {
//            if (!Character.isDigit(sequence.charAt(i))) {
//                return false;
//            }
//        }
//        return true;
