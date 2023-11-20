package OOP.Static;

import java.util.UUID;

public class Ticket {
    private UUID ticketNumber;
    private String passengerName;
    private String destination;
    private double price;


    private static double amountPrice;
    private static String amountName;

    static {
        amountPrice = 0;
        amountName = null;

    }
    public static double getTotalRevenue() {
        return amountPrice;

    }
    public static String getPassengerList(){
        return amountName;
    }


    public Ticket(String passengerName, String destination, double price) {
        this.passengerName = passengerName;
        this.destination = destination;
        this.price = price;
        this.ticketNumber = UUID.randomUUID();
        amountName += passengerName;
        amountPrice += price;

    }

    public UUID getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(UUID ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static double getAmountPrice() {
        return amountPrice;
    }

    public static void setAmountPrice(double amountPrice) {
        Ticket.amountPrice = amountPrice;
    }

    public static String getAmountName() {
        return amountName;
    }

    public static void setAmountName(String amountName) {
        Ticket.amountName = amountName;
    }


    @Override
    public String toString() {
        return "Номер билета "+ ticketNumber + " Имя пассажира "+ passengerName+ " Место полета "+ destination+ " цена билета "+ price;

    }

}
