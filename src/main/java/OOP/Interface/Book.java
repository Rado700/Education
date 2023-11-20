package OOP.Interface;

public class Book implements Online , Offline{

    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public void sellOnline() {
        System.out.println("Было продано online "+  name +" "+ author);
    }

    @Override
    public void sellOffline() {
        System.out.println("Было продано оффлайн " + name);
    }
}
