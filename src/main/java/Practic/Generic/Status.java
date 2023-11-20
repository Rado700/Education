package Practic.Generic;

public enum Status {

    RENT("Арендованный"),
    AVAILABLE("Свободный"),
    SERVICE("На ремонте");

    private String name;

    Status(String name) {
        this.name = name;
    }
}
