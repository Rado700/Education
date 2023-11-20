package OOP.Interface;

public class Journal implements Online,Offline {
    String name;
    String publication;

    int pages;

    public Journal(String name, String publication, int pages) {
        this.name = name;
        this.publication = publication;
        this.pages = pages;
    }

    @Override
    public void sellOnline() {
        System.out.println("Было продано онлайн "+ name+ " страниц "+ pages);
    }

    @Override
    public void sellOffline() {
        System.out.println("Было проданно оффлайн "+  name);
    }
}
