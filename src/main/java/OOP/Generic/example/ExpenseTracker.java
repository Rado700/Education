package OOP.Generic.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ExpenseTracker <T extends Expanse>{ // Expanse или дочерние классы

    List<T> expense = new ArrayList<>();


    public void addExpense(T t) {
        expense.add(t);
    }
    public void deleteExpense(T t){
        expense.remove(t);
    }
    public int getExpenseForDate(LocalDateTime dateTime){
        int sum = 0;
        for (T t : expense) {
            if (dateTime.toLocalDate().equals( t.getDateTime().toLocalDate())){
                sum += t.getPrice();
            }

        }
        return sum;
    }
}
