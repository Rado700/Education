package OOP.Generic.Inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Item {
    private UUID id;
    private String name;
    private Status status;
    List<HistoryItem>history;

    public Item(String name, Status status) {
        this.id =UUID.randomUUID();
        this.name = name;
        this.status = status;
        this.history = new ArrayList<>();
    }

    public UUID getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<HistoryItem> getHistory() {
        return history;
    }

    public void setHistory(List<HistoryItem> history) {
        this.history = history;
    }

    @Override
    public String toString() {
        return " id "+ id+"\n"
                +"name "+ name+"\n"
                +"статус "+ status;
    }
}
