package OOP.Inheritance;

public class SuperCar extends Car {

    boolean spoiler;

    public SuperCar(int quantityWheels, String mark, int quantityPower , boolean spoiler) {
        super(quantityWheels, mark, quantityPower);
        this.spoiler = spoiler;
    }


    @Override
    public void startEngine() {
        System.out.println("Спортивный автомобиль включил двигатель "+ spoiler + "открылся");
    }
}
