package OOP.AbstractClass;

public class Smartphone extends ElectronicDevice{

    int batteryCapacity;
    String application;

    public Smartphone(int batteryCapacity, String application) {
        this.batteryCapacity = batteryCapacity;
        this.application = application;
        this.control = false;
    }

    @Override
    public void turnOff() {
        if (control ){
            control = false;
            System.out.println("Телефон выключен");
        }
    }

    @Override
    public void turnOn() {
        if (!control){
            control = true;
            System.out.println("Телефон включен");
        }

    }

    @Override
    public String getDeviceStatus() {
        if (control){
        return "Телефон включен батарея до разряда "+ batteryCapacity+ " Находиться в приложений "+ application;
        }else {
        return "Телефон выключен";
    }

    }
}
