package OOP.Encs;

public class BookStore {
    public static void main(String[] args) {


        Book book = new Book("war of peace", new Author("Leon", "Leo@mail.ru", 'M'), 500, 2);

        System.out.println(book.getAuthor().getName());
        book.setPrice(-100);
        book.getPrice();
        System.out.println(book.getPrice());
    }
}
