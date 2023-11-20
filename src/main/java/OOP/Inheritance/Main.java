package OOP.Inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(4,"Toyota",150);
        car.startEngine();
        Truck truck = new Truck(4,"Kamaz",200,9.8);
        truck.startEngine();
        SuperCar superCar = new SuperCar(4,"Mercedes",500,true);
        superCar.startEngine();
        SuperTrack superTrack = new SuperTrack(4,"Kamaz",505,true,"Big");
        superTrack.startEngine();

        List<Car> list  = new ArrayList<>();
        list.add(truck);
        list.add(superCar);
        list.add(car);
        list.add(2,superTrack);
    }


}
