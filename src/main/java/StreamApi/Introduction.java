package StreamApi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Introduction {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(-1);
        list.add(3);
        list.add(-5);

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0){
                count++;
            }
        }

        System.out.println(count);

        System.out.println(list.stream().filter(e -> e > 0).count());

        System.out.println(IntStream.of(1,2,3,4,5,-10).filter(e -> e > 0).count());


        List<String> list1 = new ArrayList<>();
        list1.add("Petr");
        list1.add("Artur");
        list1.add("Ivan");
        list1.add("Pervi");

        list1.forEach(p -> System.out.println(p));
        List<String>list2 = list1.stream().sorted().collect(Collectors.toList());


        IntStream.of(1,2,3,4,5,1).count();


        System.out.println(list2);




    }
}
