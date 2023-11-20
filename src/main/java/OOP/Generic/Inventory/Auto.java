package OOP.Generic.Inventory;

public class Auto extends Item {

    private String mark;
    private int price;



    public Auto(String name, String mark, int price,Status status) {
        super(name,status);

        this.mark = mark;
        this.price = price;
    }


    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return " name "+ getName() + "\n"+
                "marka "+ mark + "\n"+
                "price "+ price + "\n"
                ;
    }
}
