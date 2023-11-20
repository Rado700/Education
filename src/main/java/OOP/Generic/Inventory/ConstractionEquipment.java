package OOP.Generic.Inventory;

public class ConstractionEquipment extends Item {

    private int price;

    public ConstractionEquipment(String name, Status status, int price) {
        super(name, status);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
