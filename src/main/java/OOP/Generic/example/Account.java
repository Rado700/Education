package OOP.Generic.example;

public class Account<T, K> {

    private T id;
    private K sum;

    public Account(T id, K sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public K getSum() {
        return sum;
    }

    public void setSum(K sum) {
        this.sum = sum;
    }
}
