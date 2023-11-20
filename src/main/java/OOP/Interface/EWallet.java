package OOP.Interface;

public class EWallet implements PaymentSystem {

    int balance = 0;
    double commission = 5;

    @Override
    public void makePayment(double amount) {
        double total = (amount - (commission / 100 * amount));
        if (confirmPayment(total)) {
            balance -= total;
            System.out.println("Деньги успешно переведены");

        } else System.out.println("Перевод превышет лимит платежа");
    }
    @Override
    public boolean confirmPayment(double amount) {
        return LIMITPAY > amount && balance > amount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
