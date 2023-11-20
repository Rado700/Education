package OOP.Inheritance;

import java.util.ArrayList;
import java.util.List;

public class Order {


    private final List<MenuItem> allItemMenu = new ArrayList<>();


    public void addItem(MenuItem menuItem){
        allItemMenu.add(menuItem);


    }

    public void orderList(){
        for (MenuItem menu: allItemMenu) {
            System.out.println(menu.getName() + " " + menu.getPrice());

        }
    }
    public void orderListDescription(){
        for (MenuItem menuItem : allItemMenu){
                System.out.println(menuItem);
        }
    }

    public int getAllPrice(){
        int price ;
        int allPrice = 0;
        for (int i = 0; i < allItemMenu.size(); i++) {
            price = allItemMenu.get(i).getPrice();
            allPrice += price;
        }
        return allPrice;
    }


}
