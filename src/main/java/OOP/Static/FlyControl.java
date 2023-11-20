package OOP.Static;

import java.util.ArrayList;
import java.util.List;

public class FlyControl {

    public static void main(String[] args) {

        Ticket ticket = new Ticket("Rinat","Almet",1.500);
        Ticket ticket1 = new Ticket("Airat","Chelny",1.700);

       Flight.bookTicket("Robert","Moscow",2.500);
        Flight.bookTicket("Andrey","Piter",2.100);
        Flight.bookTicket("Vova","Kazan", 3.000);



//        System.out.println(Flight.getTotalRevenue());
//        System.out.println(Flight.getPassengerList());
//        System.out.println();
//        System.out.println(Flight.allTickets);
//        System.out.println();

        System.out.println(Ticket.getTotalRevenue());
        System.out.println(Ticket.getPassengerList());

    }


}
