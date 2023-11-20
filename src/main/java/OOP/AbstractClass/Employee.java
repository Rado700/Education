package OOP.AbstractClass;

public class Employee extends Person{
    public Employee(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("This Employee");
    }
}
