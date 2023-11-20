package Practic;

public class Order {
    Product[] itemProducts = new Product[15];
    int amountAllPrice = 0;

    public String addProducts(Product item, int quantity){
        for (int i = 0; i < itemProducts.length && quantity > 0 && item.quantity > 0; i++) {
            if (itemProducts[i] == null){
                itemProducts[i] = item;
                if (quantity > 0) {
                    quantity--;
                }
                item.decreaseProduct(1);
                amountAllPrice += item.price;

            }
        }
        if (quantity == 0){
            return "Продукт добавлен";
        }else if (item.quantity == 0){
            System.out.println("На"+  item.name +" заказы больше не принимаються на складе больше нету");
            return "Не хватило места";
        }
        return "На складе больше нету места, товары не принимаются";
    }

    public void removeProducts(Product item, int quantity){
        for (int i = 0; i < itemProducts.length; i++) {
            if (itemProducts[i] == item){
                itemProducts = null;
                quantity--;
                item.quantity ++;
                amountAllPrice -= item.price;
            }
        }
    }

    public String getAmountAllPrice() {

        return  "Обащая сумма заказа " + amountAllPrice;
    }
}
