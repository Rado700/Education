package Practic;

public class Product {
    String name;
    int price;
    int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int decreaseProduct(int amount){
        if (amount > 0 && quantity != 0){
            this.quantity --;
        }
        return amount;
    }
    public int increaseProduct(int amount){
        if (amount != 0){
            this.quantity++;
        }
        return amount;
    }

    public String getAllPriceProduct(){

       return name + " общая стомиость оставшегося товара "+ price*quantity;
    }

    @Override
    public String toString() {
        return "Название товара "+ name+ " цена товара "+ price + " количество "+ quantity;
    }
}
