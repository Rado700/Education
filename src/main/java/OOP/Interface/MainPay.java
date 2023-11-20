package OOP.Interface;

import java.util.ArrayList;
import java.util.List;

public class MainPay {
    public static void main(String[] args) {

//        DeviceStore productStore = new DeviceStore("Apple",2000,1000);

        List<PaymentSystem> paymentSystems = new ArrayList<>();

        EWallet eWallet = new EWallet();
        CreditCard creditCard = new CreditCard();

        paymentSystems.add(new BankTransfer());
        paymentSystems.add(new CreditCard());
        paymentSystems.add(new EWallet());
        eWallet.setBalance(750);


        paymentSystems.get(0).makePayment(999);
        paymentSystems.get(1).makePayment(900);
        paymentSystems.get(2).makePayment(70);
        System.out.println();
        System.out.println(creditCard.getBalance());
        System.out.println(eWallet.getBalance());

    }
}
