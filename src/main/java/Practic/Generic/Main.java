package Practic.Generic;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        BoxingInventary boxingInventary = new BoxingInventary("helmet",2500,Status.AVAILABLE);
        BoxingInventary boxingInventary2 = new BoxingInventary("nodule",300,Status.AVAILABLE);
        BoxingInventary boxingInventary3 = new BoxingInventary("glove",3000,Status.AVAILABLE);



        Inventer<BoxingInventary>boxingInventar = new Inventer<>();

        boxingInventar.addInvetory(boxingInventary);
        boxingInventar.addInvetory(boxingInventary2);
        boxingInventar.addInvetory(boxingInventary3);

        boxingInventar.rentItem("helmet", LocalDate.now());
        boxingInventar.rentItem("nodule",LocalDate.now());
        boxingInventar.rentItem("glove",LocalDate.now());




        boxingInventar.reliseInventory("glove",Status.SERVICE);
        boxingInventar.reliseInventory("nodule",Status.SERVICE);


        boxingInventar.hystoryService();
//        boxingInventar.historyAvailable();
//
//        boxingInventar.hystoryRent();
    }

}
