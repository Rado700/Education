package OOP;

import java.util.Arrays;

public class Order {

    Product [] productList = new Product[10];
    int totalCost = 0 ;  // Суммарная стоимость заказа


    public String addProduct(Product item, int quantity) {  // добавляем продукт

        for (int i = 0; i < productList.length && item.quantity > 0 && quantity > 0; i++) {
            if (productList[i] == null) {
                productList[i] = item;
                if (quantity > 0) {
                    quantity--;
                }
                item.decreaseQuantity(1);
                totalCost += item.price;
            }
        }
        if (quantity <= 0) {
            return "Элементы добавлены";
        } else if (item.quantity == 0) {
            System.out.println("На " + item.name + " заказы не принимаются на складе больше нету");
            return  "Не хватило места";
        }

        return "На складе больше нету места для приема товара";
    }
    public void removeProduct (Product item, int quantity){  // удаляем продукт

        for (int i = 0; i < productList.length && quantity > 0 ; i++) {
            if (productList[i] == item){
                productList[i] = null;
                item.increaseQuantity(1);
                quantity--;
                totalCost -= item.price;
            }
        }

    }


    public String getTotalCost() {    // выводим суммарную стоимость заказа

        return  "Общая сумма заказа " + totalCost + " руб";


    }

}
