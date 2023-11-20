package OOP.Generic.Inventory;

import java.time.LocalDateTime;

public class HistoryItem {

    private LocalDateTime dateTime;
    private Status status;

    public HistoryItem(LocalDateTime dateTime, Status status) {
        this.dateTime = dateTime;
        this.status = status;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "История предмета = " +
                "время регистраций " + dateTime +
                " статус " + status ;
    }
}
