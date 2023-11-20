package OOP.Inheritance;

public class Truck extends Car {

    double capacity;

    public Truck(int quantityWheels, String mark, int quantityPower, double capacity) {
        super(quantityWheels, mark, quantityPower);
        this.capacity = capacity;
    }
    @Override
    public void startEngine() {
        System.out.printf("Двигатель %s запущен на %d л.с. с обьемом %f тонн \n", mark, quantityPower,capacity);
    }

}
