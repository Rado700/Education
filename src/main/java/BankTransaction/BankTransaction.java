package BankTransaction;

import java.time.LocalDateTime;

public class BankTransaction {    // Банковская транзакция

    private final int transactionAmount; // Сумма денег переведенных в рамках транзакции
    private final String transactionType ;   // тип транзакций , пополнения или снятие
    private final LocalDateTime transactionTime;   // время транзакций , время и дата транзакций



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
        return "Сумма транзакций "+ transactionAmount +
                " Тип транзакций " + transactionType + '\'' +
                " Время транзакций " + transactionTime;
    }
}
//    Этот класс будет представлять банковскую транзакцию и должен иметь следующие закрытые поля:
//
//        transactionAmount (сумма транзакции) - сумма денег, переведенных в рамках транзакции.
//        transactionType (тип транзакции) - может быть "Пополнение" или "Снятие".
//        transactionTime (время транзакции) - дата и время выполнения транзакции.
//        Создайте конструктор для инициализации транзакции с указанием суммы, типа и времени.
//
//        Создайте методы-геттеры (getters) для полей.
