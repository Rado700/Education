package OOP.Generic.example;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Account<Integer, Integer> account = new Account<>(1,100);
        Account<String, Double> account1 = new Account<>("1",100.0);
        System.out.println(account.getId());
        System.out.println(account1.getId());

        ExpenseTracker<Expanse> expenseTracker = new ExpenseTracker<>();
        expenseTracker.addExpense(new Expanse(500,"Products", LocalDateTime.now()));
        expenseTracker.addExpense(new Expanse(1000,"Auto",LocalDateTime.now()));

        System.out.println(expenseTracker.getExpenseForDate(LocalDateTime.now()));

    }
}
