package OOP.Inheritance;

public class Dish extends MenuItem{

    private double calories;
    private String ingredients;

    public Dish(String name, int price, String description, double calories, String ingredients) {
        super(name, price, description);
        this.calories = calories;
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Блюда "+ this.getName() + " : сколько колорий "+ calories+ " Ингредиенты "+ ingredients;
    }
}
