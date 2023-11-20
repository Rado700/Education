package OOP.Generic.Inventory;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Inventory<T extends Item> {

    List<T> inventory = new ArrayList<>();


    public void addInventory(T t) {
        inventory.add(t);

    }


    public void reliseInventory(String name, Status status, LocalDateTime dateTime) {
        for (T t : inventory) {
            if (Objects.equals(t.getName(), name)) {
                t.setStatus(status);
                t.history.add(new HistoryItem(dateTime, status));
            }

        }

    }

    public String rentItem(String name, LocalDateTime dateTime) {

        String allName = "";
        for (T t : inventory) {
            if (t.getName().equals(name) && t.getStatus() == Status.AVAILABLE) {
                allName += name;
                t.history.add(new HistoryItem(dateTime,Status.RENT));
                t.setStatus(Status.RENT);
                break;
            }
        }
        if (allName.equals("")){
            System.out.println(name + " not found");
        }
        return allName;
    }

    public void historyRent() {

        for (T t : inventory) {
            if (t.getStatus().equals(Status.RENT)) {
                System.out.println
                        (t.getName() + " " +
                                t.getId() +
                                t.history.toString());
            }
        }


    }


    public void historyProducts() {

    int count = 0;
        for (T product : inventory) {
            if (product.getStatus()== Status.AVAILABLE){
                count++;
            }
            System.out.println(product.getName() + product.getStatus());


        }

        System.out.println("Общее количество : " + inventory.size() + "\n" +
                "Кол-во свободных = "+ count+ "\n");
    }


}
