package OOP.Static;

import java.util.ArrayList;
import java.util.List;

public class Flight {
   static List<Ticket> allTickets = new ArrayList<>();



    public static void bookTicket(String passangerName,String destination,double price) {
        Ticket ticket = new Ticket(passangerName, destination, price);
        allTickets.add(ticket);

    }
    public static List<String> getPassengerList(){
        List<String> passengers = new ArrayList<>();         //Предварительный заказ
        for (int i = 0; i <allTickets.size() ; i++) {
            String name = allTickets.get(i).getPassengerName();
            passengers.add(name);
        }
        return passengers;
    }

    public static double getTotalRevenue(){
        double price;
        double allPrice =0;                                  //  Получите общий доход

        for (int i = 0; i < allTickets.size(); i++) {
            price = allTickets.get(i).getPrice();
            allPrice += price;
        }
        return allPrice;
    }


// Тестовый класс для проверки функциональности Flight.
// В этом тестовом классе забронируйте несколько билетов на рейс с помощью bookTicket,
// а затем проверьте общую сумму выручки с помощью getTotalRevenue и список имен пассажиров с помощью getPassengerList

}