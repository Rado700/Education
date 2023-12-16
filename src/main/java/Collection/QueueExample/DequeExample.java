package Collection.QueueExample;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Queue;

public class DequeExample {
    public static void main(String[] args) {

        Deque<Integer> ArrayDeque = new ArrayDeque<>();
        ArrayDeque.add(1);
        ArrayDeque.addLast(5);
        ArrayDeque.add(3);
        ArrayDeque.addFirst(22);
        ArrayDeque.pop();


        System.out.println(ArrayDeque);
    }

}
