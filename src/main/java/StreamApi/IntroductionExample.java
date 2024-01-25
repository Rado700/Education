package StreamApi;

import java.util.*;
import java.util.stream.Collectors;

public class IntroductionExample {
    public static void main(String[] args) {
        Person person1 = new Person("Artur",17);
        Person person2 = new Person("Dima",21);
        Person person3 = new Person("Stepan",15);
        Person person4 = new Person("Anton",29);
        Person person5 = new Person("Kirill",39);

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);

        //Средний возраст
        double SredVozrast = personList.stream().mapToDouble(Person::getAge).average().orElse(0);
        //старше 25 лет
        List<Person>agePeople = personList.stream().filter(p->p.getAge()>25).toList();
        //выбрать имена у которых возраст меньше 30 лет
        List<String>namePeople = personList.stream().filter(person -> person.getAge()<30).map(person -> person.getName()).collect(Collectors.toList());
        System.out.println(namePeople);
        //отсартировать по возрасту
        List<Person>sortPeople = personList.stream().sorted((p1, p2) -> Integer.compare(p2.getAge(), p1.getAge())).collect(Collectors.toList());
        System.out.println(sortPeople);
        //Положить в Мар ключ значение
        Map<String,Integer> people = personList.stream().collect(Collectors.toMap(p -> p.getName(), p->p.getAge()));
        System.out.println(people);
        //добавить к возрасту +3 года
        List<Person>nameChange = personList.stream().peek(p -> p.setAge(p.getAge() + 3)).toList();
        //поменять имя
        List<Person>nameChange2 = personList.stream().peek(person -> person1.setName("ssq")).toList();
        System.out.println(nameChange2);
        //foreach по имени старше 30лет
        personList.stream().filter(person -> (person.getAge()>30)).forEach(person -> System.out.println(person.getName()));



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
        System.out.println("---------------");

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
