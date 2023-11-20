package OOP.Inheritance;

public class Beverage extends MenuItem {

    private double volume;
    private boolean alcoholic;


    public Beverage(String name, int price, String description, double volume, boolean alcoholic) {
        super(name, price, description);
        this.volume = volume;
        this.alcoholic = alcoholic;

    }

    @Override
    public String toString() {
        return "Напиток "+ this.getName() + "  : Обьем напитка "+ volume+ " Есть ли алкоголь "+ alcoholic;
    }
}
