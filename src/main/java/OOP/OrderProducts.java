package OOP;

public class OrderProducts {
    public static void main(String[] args) {


      Product product = new Product("iphone",2500,5);
      Product product1 = new Product("Galaxy",3000,5);
      Product product2 = new Product("Huawei",2000,5);
      Product product3 = new Product("Honor",2100,5);
      product.decreaseQuantity(1);

      Order order = new Order();
      Order order1 = new Order();
      order.addProduct(product,3);
      order.addProduct(product1,5);

      order1.addProduct(product3,2);

      order1.addProduct(product2,2);

      order.removeProduct(product,0);





        System.out.println(product);
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
      System.out.println();
      System.out.println(product.totalAmount());
      System.out.println(product1.totalAmount());
      System.out.println(product2.totalAmount());
      System.out.println( product3.totalAmount());
      System.out.println();

       System.out.println(order.getTotalCost());
      System.out.println(order1.getTotalCost());
    }
}
