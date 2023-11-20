package OOP.Inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainMenu {

    private static Menu createMenu(){
        Menu menu = new Menu();
        Dish dish2 = new Dish("egg",250,"steeps",120,"salt");
        Beverage beverage2 = new Beverage("pinacolada",350,"veryStrong",500,true);

        Dish dish = new Dish("Spagetti",350,"VeryTasty",200,"Cheese");
        menu.addToMenu(dish);

        Beverage beverage = new Beverage("Cosmopolitan",1200,"very tasty",300,true);
        menu.addToMenu(beverage);


        menu.addToMenu(dish2);
        menu.addToMenu(beverage2);
        return menu ;
    }

    private static Order createOrder(Menu menu, List<String> name){
        Order order = new Order();

        for (int i = 0; i < name.size(); i++) {
            order.addItem(menu.getItem(name.get(i)));
        }
        return order;
    }

    private static void orderInfo(Order order){
        order.orderList();

        order.orderListDescription();
        System.out.println("Общий чек заказа " + order.getAllPrice());
    }


    public static void main(String[] args) {
        Menu menu = createMenu();
        menu.listMenu();
        System.out.println();
        Order order1 = createOrder(menu, new ArrayList<>(Arrays.asList("egg", "Spagetti","Cosmopolitan")));

        orderInfo(order1);
    }
}
