package OOP.Inheritance;


public class Car {
    int quantityWheels;
    String mark;
    int quantityPower;

    public Car(int quantityWheels, String mark, int quantityPower) {
        this.quantityWheels = quantityWheels;
        this.mark = mark;
        this.quantityPower = quantityPower;
    }
    public void startEngine(){
        System.out.printf("Двигатель %s запущен на %d л.с.\n", mark, quantityPower);
    }

}
