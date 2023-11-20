package OOP.Encs;

public class Book {
    private String name;
    private Author author;
    private int price;
    private int qty;

    public Book(String name, Author author, int price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null){
            return;
        }
        this.name = name;
    }

    public Author getAuthor() {

        return author;
    }

    public void setAuthor(Author author) {
        if (author == null){
            return;
        }
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 0){
            return;
        }
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        if (qty < 0){
            return ;
        }
        this.qty = qty;
    }
}
