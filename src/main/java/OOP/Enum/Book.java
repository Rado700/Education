package OOP.Enum;

public class Book {
    private String name;
    private BookType bookType;

    public Book(String name, BookType bookType) {
        this.name = name;
        this.bookType = bookType;
    }

    public String getName() {
        return name;
    }

    public BookType getBookType() {
        return bookType;
    }
}
