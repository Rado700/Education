package StreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
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

        double SredVozrast = personList.stream().mapToDouble(Person::getAge).average().orElse(0);
        List<Person>agePeople = personList.stream().filter(p->p.getAge()>25).toList();
        List<String>namePeople = personList.stream().filter(person -> person.getAge()<30).map(person -> person.getName()).collect(Collectors.toList());
        System.out.println(namePeople);
        List<Person>sortPeople = personList.stream().sorted((p1, p2) -> Integer.compare(p2.getAge(), p1.getAge())).collect(Collectors.toList());
     //   int count = personList.stream().count().;

        System.out.println(sortPeople);

        Map<String,Integer>people = personList.stream().collect(Collectors.toMap(p -> p.getName(),p->p.getAge()));
        System.out.println(people);
        List<Person>nameChange = personList.stream().peek(p -> p.setAge(p.getAge() + 3)).toList();
        List<Person>nameChange2 = personList.stream().peek(person -> person1.setName("ssq")).toList();
        System.out.println(nameChange2);
        personList.stream().filter(person -> (person.getAge()>30)).forEach(person -> System.out.println(person.getName()));


    }
}
