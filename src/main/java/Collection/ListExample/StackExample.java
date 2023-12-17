package Collection.ListExample;

import java.util.*;

public class StackExample {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(11);

        int top = stack.pop();
        stack2.push(top);


        stack.pop();
        stack.pop();
        stack.pop();
        stack.empty();

        System.out.println(stack.empty());


        System.out.println(isVailds("(())(()"));
//        System.out.println(isValid("[](){}"));
//        System.out.println(isValid("[({})]"));
//        System.out.println(isValid("[({)]}"));
//        System.out.println(isValid("[[[["));
        System.out.println(numeration("4,3,4,2,1,1,1,1,4"));

        Queue<Integer> one = new LinkedList<>();
        one.offer(1);
        one.offer(3);
        one.offer(5);
        one.offer(7);
        one.offer(9);

        Queue<Integer> two = new LinkedList<>();
        two.offer(2);
        two.offer(4);
        two.offer(6);
        two.offer(8);
        two.offer(0);
//
        System.out.println(botva(one, two));
    }

    public static String isVailds(String s) {

        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));

            } else {
                if (stack.empty()) {
                    count += 1;
                    if (count == 2) {

                        return "Не верно";
                    }

                } else {
                    Character cs = s.charAt(i);
                    Character last = stack.pop();

                    if (cs == ')' && last == '(') {

                    } else {
                        return "Не верная";
                    }

                }
            }
        }
        if (stack.empty() && count == 0) {
            return "Верная ";
        } else if (stack.size() == 1 || count == 1) {
            return "Почти верная";
        }
        return "Не верная";
    }


    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));

            } else {
                Character c = s.charAt(i);
                if (stack.empty()) {
                    return false;
                }

                Character stack_last = stack.pop();
                if (c == ']' && stack_last == '[' || c == ')' && stack_last == '(' || c == '}' && stack_last == '{') {


                } else {
                    return false;
                }
            }
        }
        if (stack.empty()) {
            return true;
        }
        return false;
    }

    public static String botva(Queue<Integer> one, Queue<Integer> two) {
        int count = 0;

        while (!one.isEmpty() && !two.isEmpty()) {
            count++;
            int onePers = one.poll();
            int twoPers = two.poll();
            if (onePers > twoPers && twoPers != 0 || onePers == 0) {
                one.offer(onePers);
                one.offer(twoPers);

            } else {
                two.offer(onePers);
                two.offer(twoPers);

            }
            if (count > Math.pow(10, 6)) {
                return "botva";
            }

        }
        if (one.isEmpty()) {
            return "Win is two" + count;
        } else
            return "one " + count;
    }


    public static String numeration(String numbers) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        int countTwo = 1;
        String [] result = numbers.split(",");
        for (int i = 0; i < result.length; i++) {
            int d = Integer.parseInt(result[i]);

            if (d > 9) {
                return "больше 9";
            }

            if (!stack.empty()){
                if (stack.peek() == d)
                    countTwo++;
                else if (countTwo >= 3) {
                    for (int j = 0; j < countTwo; j++) {
                        stack.pop();
                    }
                    count += countTwo;
                    countTwo = 1;
                }else {
                    countTwo = 1;
                }
            }
            stack.push(d);

        }
        if (countTwo >= 3) {
            for (int j = 0; j < countTwo; j++) {
                stack.pop();
            }
            count += countTwo;
        }
        System.out.println(stack);
        return "Всe " + count;
    }
}