package StreamApi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class Main {
    public static void main(String[] args) {

        List<String>products = Arrays.asList("Laptop:1200", "Smartphone:800","Headphones:150","Camera:900","Tablet:1000");
        //Разделить на Map ключ значение
        Map<String,Integer>newMap = products.stream().map(p->p.split(":")).collect(Collectors.toMap(strings -> strings[0],val->Integer.valueOf(val[1])));
        System.out.println(newMap);
        //Найти среднюю
        OptionalDouble averagePrice = products.stream().mapToInt(p->Integer.parseInt(p.split(":")[1])).average();
        System.out.println(averagePrice);



//        Stream<String> phones = Stream.of("iPhone 8", "HTC U12", "Huawei Nexus 6P",
//                "Samsung Galaxy S9", "LG G6", "Xiaomi MI6", "ASUS Zenfone 2",
//                "Sony Xperia Z5", "Meizu Pro 6", "Lenovo S850");
//
//        HashSet<String> filteredPhones = phones.filter(s->s.length()<12).
//                collect(Collectors.toCollection(HashSet::new));
//
//        filteredPhones.forEach(s->System.out.println(s));


        Stream<String> phones = Stream.of("iPhone 8", "HTC U12", "Huawei Nexus 6P");

        ArrayList<String> filteredPhones = phones.filter(s->s.length()<12)
                .collect(
                        ()->new ArrayList<String>(), // создаем ArrayList
                        (list, item211)->list.add(item211), // добавляем в список элемент
                        (list1, list2221)-> list1.addAll(list2221)); // добавляем в список другой список

        filteredPhones.forEach(s->System.out.println(s));
    }
}

