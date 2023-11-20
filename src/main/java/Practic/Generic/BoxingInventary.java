package Practic.Generic;

public class BoxingInventary extends ItemBoxes{



    public BoxingInventary(String name, int price, Status status) {
        super(name, price, status);

    }

    @Override
    public String toString() {
        return "BoxingInventary{" +
                "timeList=" + timeList +
                '}';
    }
}
