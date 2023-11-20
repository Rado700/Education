package BankTransaction;

import java.util.UUID;


public class BankAccount { // банковский счет

    private int balance;        // баланс счета
    private final UUID accountNumber;  // номер счета
    private String owner;       // владелец счета
    private final BankTransaction[] transactions;   // список транзакций связанных с этим счетом


    public BankAccount(int balance, String owner) {
        this.balance = balance;
        this.accountNumber = UUID.randomUUID();
        this.owner = owner;
        this.transactions = new BankTransaction[10];
    }

    public BankAccount(String owner) {
        this.accountNumber = UUID.randomUUID();
        this.owner = owner;
        this.balance = 0;
        this.transactions = new BankTransaction[10];

    }

    public int deposit(double amount) {
        balance += amount;
        return balance;
    }

    public int withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }else {

            System.out.println(getOwner()+"= Сумма снятия превышает баланс");
        }
        return balance;
    }
    public void addTransaction(BankTransaction transaction) {
        if (transaction.getTransactionType().equals("deposit")) {
            deposit(transaction.getTransactionAmount());
        } else {
            withdraw(transaction.getTransactionAmount());
        }
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] == null) {
                transactions[i] = transaction;
                break;
            }
        }


    }


    public void getHistoryTransaction() {
        int count = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] != null) {
                System.out.println(transactions[i]); // [..., ..., ]
                count += 1;
            }
        }
        if (count == 0) {

            System.out.println(getOwner()+" = Транзакций нету");

        }
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance < 0) {
            return;
        }
        this.balance = balance;
    }

    public UUID getAccountNumber() {
        return accountNumber;
    }


    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        if (owner == null) {
            return;
        }
        this.owner = owner;
    }

    public BankTransaction[] getTransactions() {
        return transactions;
    }




//
//
//        }
//    }

    @Override
    public String toString() {
        return "Баланс владельца " + balance +
                " Номер счета владельца " + accountNumber +
                " Владелец " + owner + '\'' +
                " Транзакция " + transactions;
    }
}
//    Реализуйте методы для выполнения банковских транзакций,
//    такие как deposit(double amount) (пополнение счета) и withdraw(double amount) (снятие средств).
//    Учтите, что эти методы должны проверять, достаточно ли средств на счете для выполнения операции.
//
//    Обеспечьте методы для получения истории транзакций для данного счета.