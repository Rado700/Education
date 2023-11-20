package Practic;

import java.time.LocalDateTime;

public class BankTransaction {

    private final int transactionAmount;
    private final String transactionType;
    private LocalDateTime transactionTime ;

    public BankTransaction(int transactionAmount, String transactionType) {
        this.transactionAmount = transactionAmount;
        this.transactionType = transactionType;
        this.transactionTime = LocalDateTime.now();
    }


    public int getTransactionAmount() {
        return transactionAmount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public LocalDateTime getTransactionTime() {
        return transactionTime;
    }

    @Override
    public String toString() {
        return "BankTransaction{" +
                "transactionAmount=" + transactionAmount +
                ", transactionType='" + transactionType + '\'' +
                ", transactionTime=" + transactionTime +
                '}';
    }
}
