package OOP.AbstractClass;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Client person = new Client("Makar","ss");
        Person person1 = new Client("Petya","sa");
//        Person person3 = new Personal("Vanya");
//
//        Employee employee = new Employee("Vasya");
//        Person person2 = new Employee("Kolya");




        ElectronicDevice Device = new  Smartphone(99,"YouTube");
        ElectronicDevice electronicDevice2 = new Television(2,25);
        ElectronicDevice electronicDevice = new Tomogochi(1,2);


        Animals animals =new Cat();
        Animals dog = new Dog();
        Animals cat =new Cat();
        Animals cow = new Cow();

        Animals human = new Dog();
        human.Minotaur();

        List<Animals> animals1 = new ArrayList<>();
        animals1.add(cat);
        animals1.add(dog);
        animals1.add(cow);

        System.out.println(animals1.get(0).Speak());


        for (Animals animal : animals1) {
            System.out.println( animal.Speak());
        }

//        electronicDevice.turnOn();
//        electronicDevice2.turnOn();
 //       System.out.println(electronicDevice.getDeviceStatus());
        System.out.println(electronicDevice2.getDeviceStatus());
        electronicDevice.turnOn();
        System.out.println(electronicDevice.getDeviceStatus());
//        System.out.println(electronicDevice instanceof Object);
//        Object object = new Smartphone(50, "Telegram");
//        double a = 2.4;
//        int b = (int)a;
//        System.out.println(((Smartphone)object).getDeviceStatus());
 //       Smartphone smartphone = new Smartphone(53, "Facebook");
        //      System.out.println((Television)smartphone);

       List<Shape>shapes = new ArrayList<>();







        Shape shape = new Circle(15.0);
        Shape shape1 = new Rectangle(10,10);
        Shape shape2 = new Triangle(10,5);
//        System.out.println(shape.calculateArea());
//        System.out.println(shape.calculatePerimeter());
//        System.out.println("Прямоугольник "+shape1.calculateArea());
//        System.out.println("Прямоуголник "+ shape1.calculatePerimeter());
//        System.out.println("Треугольник "+ shape2.calculateArea());

        shapes.add(shape);
        shapes.add(shape1);
        shapes.add(shape2);

        for (int i = 0; i < shapes.size(); i++) {
            System.out.println(shapes.get(i).calculateArea());

        }



    }
}
