package OOP.Interface;

public interface PaymentSystem {
    int LIMITPAY = 1000;



    void makePayment(double amount);

    boolean confirmPayment(double amount);

}
