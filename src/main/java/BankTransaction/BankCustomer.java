package BankTransaction;

import java.util.Random;
import java.util.Scanner;

public class BankCustomer { // клиент банка

    final private String name;
    final private BankAccount[] bankAccounts;

    public BankCustomer(String name) {
        this.name = name;
        this.bankAccounts = new BankAccount[3];

    }

    public void addBankAccount() {

        BankAccount bankAccount = new BankAccount(name);
        for (int i = 0; i < bankAccounts.length; i++) {
            if (bankAccounts[i] == null) {
                bankAccounts[i] = bankAccount;
                break;

            }
        }
    }


    public int getAccountBalance(int accountNumber) { // 1,2,3
        return bankAccounts[accountNumber - 1].getBalance();
    }

    public void addTransaction(int accountNumber, BankTransaction transaction) {

        bankAccounts[accountNumber - 1].addTransaction(transaction);
    }


    public String getName(int accountNumber) {
        return bankAccounts[accountNumber - 1].getOwner();

    }

    public void historyTransaction(int accountNumber) {
        bankAccounts[accountNumber - 1].getHistoryTransaction();
    }
}
//    Этот класс будет представлять клиента банка и должен содержать закрытое поле для хранения списка банковских счетов клиента.
//        Реализуйте методы для добавления нового банковского счета клиенту,
//        получения баланса счета, выполнения транзакций и получения истории транзакций для конкретного счета.
