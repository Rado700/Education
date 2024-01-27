package StreamApi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class Main {

    class Phone {

        private String name;
        private int price;

        public Phone(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {

//        List<String>products = Arrays.asList("Laptop:1200", "Smartphone:800","Headphones:150","Camera:900","Tablet:1000");
//        //Разделить на Map ключ значение
//        Map<String,Integer>newMap = products.stream().map(p->p.split(":")).collect(Collectors.toMap(strings -> strings[0],val->Integer.valueOf(val[1])));
//        System.out.println(newMap);
//        //Найти среднюю
//        OptionalDouble averagePrice = products.stream().mapToInt(p->Integer.parseInt(p.split(":")[1])).average();
//        System.out.println(averagePrice);
//        //Найти Мах значение
//        OptionalInt maxPrice = products.stream().mapToInt(s->Integer.parseInt(s.split(":")[1])).max();
//        System.out.println(maxPrice);
//        // Строка с пречеслением свыше 1000
//        List<String>productList = products.stream().filter(p->Integer.parseInt(p.split(":")[1]) >= 1000).collect(Collectors.toList());
//        System.out.println(productList);


        Stream<Employee> employee = Stream.of(new Employee("Robert", "ComputerSecurity", 1000),
                new Employee("Andrei", "Developer", 2000),
                new Employee("Vova", "Reklama", 1500),
                new Employee("Kostya", "Security", 1500),
                new Employee("Timur", "IT", 3500),
                new Employee("Timur3", "IT", 31500),
                new Employee("Timur2", "IT", 4500),
                new Employee("Vova2", "Reklama", 1500));
//        employee.sorted(new EmployeeComparator()).forEach(p-> System.out.printf("%s - (%s) %d \n",p.getName(),p.getDepartment(),p.getSalary()));

        //Найти среднюю зарплату всех сотрудников
//        OptionalDouble averageSotrudnik = employee.mapToDouble(Employee::getSalary).average();
//        System.out.println(averageSotrudnik);
        //Найти сотрудника с макс зарплатой
//        OptionalInt maxZP = employee.mapToInt(Employee::getSalary).max();
//        System.out.println(maxZP);

//        Map<String, Integer> max = employee.collect(Collectors.groupingBy(Employee::getName,Collectors.summingInt(Employee::getSalary)));
//        for (Map.Entry<String, Integer> item : max.entrySet()){
//            System.out.println(item.getKey()+ "-"+ item.getValue());
//        }


        //Отфильтровать чья зарплата больше средней по компаний
        Map<String,Integer>employee1 = employee.collect(Collectors.toMap(Employee::getName, Employee::getSalary));
        System.out.println(employee1);

        //Общая статистика
//        Map<String, IntSummaryStatistics> sotrudnikZP = employee.collect(Collectors
//                .groupingBy(Employee::getName,summarizingInt(Employee::getSalary)));
//        for (Map.Entry<String, IntSummaryStatistics> item : sotrudnikZP.entrySet()){
//            System.out.println(item.getKey()+ "-"+ item.getValue());
//        }


//        Сгрупируйте сотрудников по отделам
//        Map<String,List<Employee>>deportament = employee.collect(Collectors.groupingBy(Employee::getDepartment));
//        for (Map.Entry<String,List<Employee>> item: deportament.entrySet()){
//            System.out.println(item.getKey());
//            for (Employee employee1 : item.getValue()){
//                System.out.println(employee1.getName()+"\n");
//            }
//        }

        //Средняя зарплата каждого отдела
//        Map<String, IntSummaryStatistics> deportamentZP = employee.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summarizingInt((Employee::getSalary))));
//        for (Map.Entry<String, IntSummaryStatistics> item : deportamentZP.entrySet()) {
//            System.out.println(item.getKey() + "-" + item.getValue().getAverage());
//        }

        //Макс зарплаты в каждом отделе
//        Map<String, IntSummaryStatistics> deportamentZP = employee.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summarizingInt((Employee::getSalary))));
//        for (Map.Entry<String, IntSummaryStatistics> item : deportamentZP.entrySet()) {
//            System.out.println(item.getKey()+ "-"+ item.getValue().getMax());
//        }


        //Общая суммма зарплат для каждого отдела
//        Map<String, IntSummaryStatistics> deportamentZP = employee.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summarizingInt((Employee::getSalary))));
//        for (Map.Entry<String, IntSummaryStatistics> item : deportamentZP.entrySet()) {
//            System.out.println(item.getKey()+ "-"+ item.getValue().getSum());
//        }
//    }

    }
}

//        Stream<String> phones = Stream.of("iPhone 8", "HTC U12", "Huawei Nexus 6P",
//                "Samsung Galaxy S9", "LG G6", "Xiaomi MI6", "ASUS Zenfone 2",
//                "Sony Xperia Z5", "Meizu Pro 6", "Lenovo S850");
//
//        HashSet<String> filteredPhones = phones.filter(s->s.length()<12).
//                collect(Collectors.toCollection(HashSet::new));
//
//        filteredPhones.forEach(s->System.out.println(s));


//        Stream<String> phones = Stream.of("iPhone 8", "HTC U12", "Huawei Nexus 6P");
//
//        ArrayList<String> filteredPhones = phones.filter(s->s.length()<12)
//                .collect(
//                        ()->new ArrayList<String>(), // создаем ArrayList
//                        (list, item211)->list.add(item211), // добавляем в список элемент
//                       (list1, list2221)-> list1.addAll(list2221));// добавляем в список другой список
//        filteredPhones.forEach(s->System.out.println(s));

//        //метод 1 reduce
//        Stream<Integer> numbersStream = Stream.of(1,2,3,4,5,6);
//        Optional<Integer> result = numbersStream.reduce((x,y)->x*y);
//        System.out.println(result.get());
//        //метод 2 reduce
//        Stream<String> wordsStream = Stream.of("мама", "мыла", "раму");
//        Optional<String> sentence = wordsStream.reduce((x,y)->x + " " + y);
//        System.out.println(sentence.get());
//        //метод 3 reduce
//        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 6 S", 54000),
//                new Phone("Lumia 950", 45000),
//                new Phone("Samsung Galaxy S 6", 40000),
//                new Phone("LG G 4", 32000));
//
//        int sum = phoneStream.reduce(0,
//                (x,y)-> {
//                    if(y.getPrice()<50000)
//                        return x + y.getPrice();
//                    else
//                        return x + 0;
//                },
//                (x, y)->x+y);
//
//        System.out.println(sum); // 117000


//       // Постраничаная навигация с методом skip, limit
//        List<String> phones = new ArrayList<String>();
//        phones.addAll(Arrays.asList(new String[]
//                {"iPhone 6 S", "Lumia 950", "Huawei Nexus 6P",
//                        "Samsung Galaxy S 6", "LG G 4", "Xiaomi MI 5",
//                        "ASUS Zenfone 2", "Sony Xperia Z5", "Meizu Pro 5",
//                        "Lenovo S 850"}));
//        int pageSize = 3; // количество элементов на страницу
//        Scanner scanner = new Scanner(System.in);
//        while(true){
//            System.out.println("Введите номер страницы: ");
//            int page = scanner.nextInt();
//            if(page<1) break; // если число меньше 1, выходим из цикла
//            phones.stream().skip((page-1) * pageSize)
//                    .limit(pageSize)
//                    .forEach(s->System.out.println(s));
//        }

class EmployeeComparator implements Comparator<Employee> {

    public int compare2(Employee a) {
        return a.getSalary();
    }

    public int compare(Employee a, Employee b) {
        return a.getName().compareTo(b.getName());
    }
}


