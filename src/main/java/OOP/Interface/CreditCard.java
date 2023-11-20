package OOP.Interface;

import java.util.List;

public class CreditCard implements PaymentSystem{

    int balance = 10000;
    static final int MIN_BALANCE = -10000;

    @Override
    public void makePayment(double amount) {
        balance -= amount;
        if (confirmPayment(amount)) {

            System.out.println(amount +" Деньги успешно переведены");
        } else {
            System.out.println("ошибка перевода");
            balance += amount;
        }

    }
    @Override
    public boolean confirmPayment(double amount) {
        return balance > MIN_BALANCE && LIMITPAY > amount;
    }

    public int getBalance() {
        return balance;
    }
}
