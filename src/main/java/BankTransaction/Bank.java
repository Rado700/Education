package BankTransaction;

import java.util.Arrays;

public class Bank {
    public static void main(String[] args) {


        //        BankAccount client = new BankAccount(1000,"Artur");
        BankCustomer bankCustomer1 = new BankCustomer("Artur");
        BankCustomer bankCustomer2 = new BankCustomer("Anton");
        BankCustomer bankCustomer3 = new BankCustomer("Petya");
        //           BankAccount accountNumber = new BankAccount();

        bankCustomer1.addBankAccount();
        bankCustomer1.addBankAccount();
        bankCustomer1.addBankAccount();

        bankCustomer2.addBankAccount();
        bankCustomer3.addBankAccount();




        BankTransaction bankTransaction = new BankTransaction(1000, "deposit");
        BankTransaction bankTransaction1 = new BankTransaction(1500, "withdraw");
        BankTransaction bankTransaction2 = new BankTransaction(1750, "deposit");

        bankCustomer1.addTransaction(1, bankTransaction);
        bankCustomer1.addTransaction(1, bankTransaction);

        bankCustomer1.addTransaction(2, bankTransaction);
        bankCustomer1.addTransaction(2, bankTransaction1);

        bankCustomer2.addTransaction(1, bankTransaction2);
        bankCustomer2.addTransaction(1, bankTransaction2);
        bankCustomer2.addTransaction(1, bankTransaction1);
        bankCustomer3.addTransaction(1, bankTransaction2);


        bankCustomer1.historyTransaction(1);
        System.out.println();
        bankCustomer1.historyTransaction(2);
        System.out.println();
        bankCustomer2.historyTransaction(1);
        System.out.println();
        bankCustomer3.historyTransaction(1);
        System.out.println();

        System.out.println("Баланс первого клиента  "+ bankCustomer1.getAccountBalance(1));
        System.out.println("Баланс второго клиента "+ bankCustomer2.getAccountBalance(1));
        System.out.println("Баланс третьего клиента "+ bankCustomer3.getAccountBalance(1));
        System.out.println("Баланс первого клиента, второй счет "+ bankCustomer1.getAccountBalance(2));
//        System.out.println();

    }
}
//    Этот класс будет управлять всеми банковскими счетами и клиентами банка.
//        Реализуйте методы для добавления новых клиентов,
//        создания новых банковских счетов, выполнения банковских транзакций и отображения информации о счетах и клиентах.
//        Важно обеспечить полную инкапсуляцию данных, чтобы доступ к полям классов был закрытым,
//        и к ним можно было обращаться только через публичные методы классов.
//        Каждый класс должен иметь методы для безопасного взаимодействия с данными и обработки ошибок
//        (например, недостаточно средств на счете).