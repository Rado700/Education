package Collection.ListExample;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class TrainOrderStack {
    public static void main(String[] args) {


        System.out.println(wayStack());
    }

    public static String wayStack() {

        Queue<Integer> way = new LinkedList<>();
        Stack<Integer> way2 = new Stack<>();
        Stack<Integer> stop = new Stack<>();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько вагонов в поезде");
        int numbers = scanner.nextInt();
        int[] x = new int[numbers];
        System.out.println("нумерация вагонов");
        for (int i = 0; i < x.length; i++) {
            x[i] = scanner.nextInt();
        }
        for (int pull : x) {
            way.add(pull);
        }


        if (!stop.empty() || way2.empty()) {

            while (!way.isEmpty()) {
                int stopping = way.poll();
                stop.push(stopping);
                while (!stop.empty() &&( way2.empty() && stop.peek() == 1 || !way2.empty() && way2.peek() == stop.peek()- 1)){
                    way2.push(stop.pop());
                }
            }
        }
        if (!stop.empty()) {
            return "No";
        }

        return "YES";
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
