package OOP.Inheritance;

import java.util.ArrayList;
import java.util.List;

public class Menu {


    List<MenuItem> menuItems = new ArrayList<>();

    public void addToMenu(MenuItem menuItem){
        menuItems.add(menuItem);
    }
    public void listMenu(){

        for (MenuItem list:menuItems) {
            System.out.println(list.getName() +" " +list.getPrice());
        }
    }

    public MenuItem getItem(String name){
        for (MenuItem menu : menuItems) {
            if (menu.getName() == name){
                return menu;
            }

        }return null;
    }



    @Override
    public String toString() {
        return "Menu{" +
                "menuItems=" + menuItems +
                '}';
    }
}
