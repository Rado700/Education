package variables;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class example2 {

     static class TransactionAccount{

        private double amount;
        private Date date;



        public TransactionAccount(double amount) {
            this.amount = amount;
            this.date = new Date();
        }

        public double getAmount() {
            return amount;
        }

        public Date getDate() {
            return date;
        }

        @Override
        public String toString() {
            return "Сумма транзакий "+ amount +"Руб"+" Время транзакзий "+ date ;
        }
    }


    public static class AccountBank{

        private double balance;
        private List<TransactionAccount> historyTransaction;

        public AccountBank(double balance) {
            this.balance = balance;
            this.historyTransaction = new ArrayList<>();
        }

        public void deposit (double amount){
            balance += amount;
            TransactionAccount transactionAccount = new TransactionAccount(amount);
            historyTransaction.add(transactionAccount);
        }

        public void withdraw(double amount){
            if (balance >= amount){
                balance -= amount;
                TransactionAccount transactionAccount = new TransactionAccount(-amount);
                historyTransaction.add(transactionAccount);
            }else {
                System.out.println("balance insufficient");
            }
        }

        public void getHistoryTransaction(){
            for (TransactionAccount transaction:historyTransaction) {
                System.out.println(transaction);
            }
        }
        public void getBalance(){
            System.out.println(balance);
        }
    }


    public static void main(String[] args) {

        AccountBank accountBank = new AccountBank(1000000);
        accountBank.deposit(500);
        accountBank.withdraw(1000);
        accountBank.withdraw(0);
        accountBank.getHistoryTransaction();
        accountBank.getBalance();
        accountBank.getBalance();

    }
}
