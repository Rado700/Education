package OOP.Interface;

public class Main {
    public static void main(String[] args) {


        Book book = new Book("smallPrince", "Tolstoy");
        Book book1 = new Book("Rings of Right","American");

        Journal journal = new Journal("MoscowNews", "TravelMoscow",100);


        book.sellOffline();
        book.sellOnline();
        book1.sellOnline();
        journal.sellOffline();
        journal.sellOnline();

    }

}
