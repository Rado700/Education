package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class IntroductionExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(11);
        numbers.add(111);
        numbers.add(115);

        //Нахождения мин и мах
        Optional<Integer> num = numbers.stream().
                min(Integer::compareTo);
        System.out.println(num.orElse(-1));

        //Есть ли число кратное
        boolean cratno = numbers.stream().anyMatch(p->p % 5 == 0);
        System.out.println(cratno);

        // Преоброзование из Map в ..mapToInt
        int[] mas = numbers.stream().map(p->p*p).mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(mas));


        // Вывести в большой регистр и добавить слова hello
        List<String>list = new ArrayList<>();
        list.add("Artur");
        list.add("Nikolay");
        list.add("Robert");
        list.add("Evgenii");
        list.add("Artur2");

        List<String>list2 = list.stream().map(p->p.toUpperCase()+" hello".toUpperCase()).collect(Collectors.toList());

        System.out.println(list2);

        //Слить все слова в один текст с помощью char и вывести уникальные буквы
        List<Character>vseslova = list.stream().flatMap(p->p.chars().mapToObj(c -> (char) c)).distinct().collect(Collectors.toList());
        System.out.println(vseslova);

        //вывести общ кол во букв в словах
        int kolslov = list.stream().mapToInt(p -> p.length()).sum();
        System.out.println(kolslov);

        //первые 3 буквы в слове
       List<String> treeslov = list.stream().map(p -> p.substring(0,3)).collect(Collectors.toList());

        System.out.println(treeslov);


    }



}
