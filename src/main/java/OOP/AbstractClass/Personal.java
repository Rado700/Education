package OOP.AbstractClass;

public class Personal extends Person{
    public Personal(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("This personal");

    }
}
