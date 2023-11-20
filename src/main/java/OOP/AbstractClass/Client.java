package OOP.AbstractClass;

public class Client extends  Person{

    public Client(String name) {
        super(name);
    }
    String name ;

    public Client(String name, String name1) {
        super(name);
        this.name = name1;
    }

    @Override
    public void display() {

        System.out.println("sss");
    }

}
