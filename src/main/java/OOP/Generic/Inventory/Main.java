package OOP.Generic.Inventory;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Inventory<OfficeEquipment> officeInventory = new Inventory<>();
        Inventory<ConstractionEquipment> constructionItem = new Inventory<>();
        Inventory<Auto> officeAuto = new Inventory<>();


        OfficeEquipment printer = new OfficeEquipment("printer", "Sony", 3000, Status.AVAILABLE);
        OfficeEquipment scanner = new OfficeEquipment("scanner", "samsung", 250, Status.AVAILABLE);

        ConstractionEquipment pila = new ConstractionEquipment("pila", Status.AVAILABLE,500);
        ConstractionEquipment drill = new ConstractionEquipment("drill", Status.AVAILABLE,400);

        Auto bmw = new Auto("bmwX6", "bmw", 10000, Status.AVAILABLE);
        Auto audi = new Auto("audiA4", "audi", 3000, Status.AVAILABLE);


        constructionItem.addInventory(drill);
        constructionItem.addInventory(pila);

        officeInventory.addInventory(printer);
        officeInventory.addInventory(scanner);

        officeAuto.addInventory(bmw);
        officeAuto.addInventory(audi);

        ////////

        constructionItem.reliseInventory("drill",Status.AVAILABLE,LocalDateTime.now());
        constructionItem.reliseInventory("pila", Status.AVAILABLE,LocalDateTime.now());

        officeInventory.reliseInventory("scanner", Status.AVAILABLE,LocalDateTime.now());
        officeInventory.reliseInventory("printer", Status.RENT,LocalDateTime.now());

        constructionItem.rentItem("drill",LocalDateTime.now());
        constructionItem.rentItem("pila", LocalDateTime.now().minusHours(1));

        officeInventory.rentItem("drill",LocalDateTime.now());
        //       officeInventory.rentItem("pila",LocalDateTime.now());


        constructionItem.historyRent();
  //      officeInventory.historyRent();
//        officeAuto.historyRent();

        constructionItem.historyProducts();
        officeInventory.historyProducts();
        officeAuto.historyProducts();
    }
}
