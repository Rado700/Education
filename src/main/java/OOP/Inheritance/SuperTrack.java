package OOP.Inheritance;

public class SuperTrack extends SuperCar {

    String exthaust;

    public SuperTrack(int quantityWheels, String mark, int quantityPower, boolean spoiler, String exthaust) {
        super(quantityWheels, mark, quantityPower, spoiler);
        this.exthaust = exthaust;
    }

    @Override
    public void startEngine() {
        System.out.printf("Двигатель %s запущен на %d л.с. %s exhaust \n", mark, quantityPower,exthaust);
    }
}
