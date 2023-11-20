package OOP.Generic.Inventory;

public enum Status {

    AVAILABLE("Доступен"),
    RENT("Арендован"),
    SERVICE("На ремонте");


    String name ;

    Status(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name;
    }
}
