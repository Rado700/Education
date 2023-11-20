package Practic.Generic;

import java.util.ArrayList;
import java.util.List;

public abstract class ItemBoxes {

    private String name;
    private int price;
    private Status status;
    List<HistoryRent> timeList;

    public ItemBoxes(String name, int price, Status status) {
        this.name = name;
        this.price = price;
        this.status = status;
        this.timeList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<HistoryRent> getTimeList() {
        return timeList;
    }

    public void setTimeList(List<HistoryRent> timeList) {
        this.timeList = timeList;
    }

    @Override
    public String toString() {
        return "Экипировка для бокса " +
                "Название " + name + '\'' +
                "цена " + price +
                "статус " + status +
                "время регистра " + timeList ;
    }
}
