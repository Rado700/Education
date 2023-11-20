package Practic.Generic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Inventer <E extends ItemBoxes> {


    List<E> inventory = new ArrayList<>();


    public void addInvetory(E e) {
        inventory.add(e);
    }

    public void rentItem(String name, LocalDate localDate) {
        String allName = "";
        for (E e : inventory) {
            if (e.getStatus() == Status.AVAILABLE && e.getName().equals(name)) {
                e.setStatus(Status.RENT);
                allName += name;
                e.timeList.add(new HistoryRent(localDate, Status.RENT));
                break;

            }

        }
        if (allName.equals("")) {
            System.out.println("Таких предметов нету " + name);
        }


    }

    public void reliseInventory(String name, Status status) {

        for (E e : inventory) {
            if (e.getName().equals(name)) {
                e.setStatus(status);
                e.timeList.add(new HistoryRent(LocalDate.now(), status));

            }

        }
    }

    public void hystoryRent() {
        for (E e : inventory) {
            if (e.getStatus() == Status.RENT) {
                System.out.println(e.getName() + e.getPrice() + e.timeList.toString());
            }
        }
    }

    public void hystoryService() {
        for (E e : inventory) {
            if (e.getStatus() == Status.SERVICE) {
                System.out.println(e.getName() + e.getPrice() + e.timeList.toString());

            }
        }
    }

    public void historyAvailable() {
        for (E e : inventory) {
            if (e.getStatus() == Status.SERVICE) {
                System.out.println(e.getName() + e.getPrice() + e.timeList.toString());

            }
        }
    }
}
