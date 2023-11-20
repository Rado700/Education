package OOP.Generic.example;

import java.time.LocalDateTime;

public class Expanse {
    private int price ;
    private String name;
    private LocalDateTime dateTime;

    public Expanse(int price, String name, LocalDateTime dateTime) {
        this.price = price;
        this.name = name;
        this.dateTime = dateTime;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
