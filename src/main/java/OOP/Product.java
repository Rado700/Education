package OOP;

public class Product {
    String name;
    double price;
    int quantity;

    @Override
    public String toString() {
        return "Название товара = "+name + ", Цена товара= "+ price + ", Количество товара = "+ quantity;
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;



    }
    public int decreaseQuantity(int amount){
        if (amount > 0&& quantity != 0){
            this.quantity -- ;
        }
        return amount;
    }
    public int increaseQuantity(int amount){
        if (amount > 0){
            this.quantity++;
        }
        return amount;
    }

    public String totalAmount (){


        return   name + " Общая сумма остатка " + price*quantity + "руб";

    }

}
