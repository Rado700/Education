package OOP.Interface;

public class BankTransfer implements PaymentSystem{

    @Override
    public void makePayment(double amount) {
        if (confirmPayment(amount)){
            System.out.println("сумма платежа "+ amount);
        }else {
            System.out.println("сумма платежа превышает лимит ввода");
        }

    }

    @Override
    public boolean confirmPayment(double amount) {

        return  LIMITPAY > amount;
    }
}
