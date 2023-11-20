package OOP.Generic.Inventory;

public class OfficeEquipment extends Item {
    private String mark;
    private int price;

    public OfficeEquipment( String name, String mark, int price,Status status) {
        super(name,status);
        this.mark = mark;
        this.price = price;;
        this.setStatus(status);
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
        return " name "+ super.getName() + "\n"+
                "mark "+ mark + "\n"+
                "статус "+ price;
    }
}
