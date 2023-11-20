package Practic;

import variables.example2;

import java.util.Arrays;

public class BankCustomer { // Клиент Банка

    private final String name;
    private final BankAccount [] accounts;

    public BankCustomer(String name) {
        this.name = name;
        this.accounts = new BankAccount[3];
    }

    public void addAccount (){
        BankAccount bankAccount = new BankAccount(name);
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null){
                accounts[i] = bankAccount;
                break;
            }
        }

    }
    public int getBalance(int accountNumber){
       return accounts[accountNumber -1].getBalance();
    }

    public void getTransaction(int accountNumber , BankTransaction transaction){
        accounts[accountNumber -1].addTransaction(transaction);

    }

   public void getAccountHistory(int accountNumber){
        accounts[accountNumber -1].getHistory();
   }

    @Override
    public String toString() {
        return "BankCustomer{" +
                "name='" + name + '\'' +
                ", accounts=" + Arrays.toString(accounts) +
                '}';
    }
}
