package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(3);
        myList.add(0,1);
        System.out.println(myList);
        System.out.println(myList.get(0));
        myList.remove(2);
        System.out.println(myList);
        myList.set(0, 100);
        System.out.println(myList);
        System.out.println(myList.contains(100));
        System.out.println(myList.size()); // len
        for (int i = 0; i < myList.size(); i++) {

        }

        for (Integer el : myList){
            System.out.println(el);
        }
//        myList.remove()
    }
}
