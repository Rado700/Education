package Practic;

import java.util.Arrays;

public class BankAccount { // Банковский счет

    private int balance;
    private String owner;
    private  BankTransaction [] transactions;



    public void deposit(double amount){
        if (balance >= 0){
            balance += amount;
        }
    }
    public void withdraw(double amount){
        if (balance <= 0 && amount > balance){
            return;
        }else {
            balance -= amount;
        }
    }


    public void addTransaction(BankTransaction transaction){
            if (transaction.getTransactionType().equals("deposit")){
                deposit(transaction.getTransactionAmount());
            }else
                withdraw(transaction.getTransactionAmount());

        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] == null){
                transactions[i] = transaction;
                break;

            }
        }

    }

        public void getHistory(){
        int count = 0;
            for (int i = 0; i < transactions.length; i++) {
                if (transactions[i] != null){
                    System.out.println(transactions[i]);
                    count += 1;
                }
            }
            if (count == 0){
                System.out.println("Транцзакций больше нету");
            }
        }


    public BankAccount(String owner) {
        this.balance = balance;
        this.owner = owner;
        this.transactions = new BankTransaction[10];
    }



    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance < 0){
            return;
        }
        this.balance = 0;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        if (owner == null){
            return;
        }
        this.owner = owner;
    }

    public BankTransaction[] getTransaction() {
        return transactions;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", owner='" + owner + '\'' +
                ", transactions=" + Arrays.toString(transactions) +
                '}';
    }
}
