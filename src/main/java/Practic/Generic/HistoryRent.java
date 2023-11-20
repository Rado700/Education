package Practic.Generic;

import java.time.LocalDate;

public class HistoryRent {

    private LocalDate localDate;
    private Status status;

    public HistoryRent(LocalDate localDate, Status status) {
        this.localDate = localDate;
        this.status = status;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Дата " +
                 localDate +
                " статус " + status;
    }
}
