package Practic;

public class OrderProduct {
    public static void main(String[] args) {

        Order order = new Order();
        Product product = new Product("Iphone",2000,5);
        Product product1 = new Product("Samsung", 2500,5);
        Product product2 = new Product("Huawei",2700,5);
 //       product.decreaseProduct(1);

        order.addProducts(product,6);
        order.addProducts(product1,0);
        order.addProducts(product2,0);

        System.out.println(product);
        System.out.println(product1);
        System.out.println(product2);

        System.out.println(order.getAmountAllPrice());
        System.out.println(product.getAllPriceProduct());

    }
}
