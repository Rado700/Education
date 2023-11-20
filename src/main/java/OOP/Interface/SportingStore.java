package OOP.Interface;

import java.util.ArrayList;
import java.util.List;

public class SportingStore {

    String clothes;

    int price;


    List<PaymentSystem> paymentSystem = new ArrayList<>();

    public SportingStore(String clothes, int price) {
        this.clothes = clothes;
        this.price = price;
    }

    EWallet eWallet = new EWallet();


}
