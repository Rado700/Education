package OOP.AbstractClass;

public class Television extends ElectronicDevice{


    int chanel;
    int volume;



    public Television(int chanel, int volume) {
        this.chanel = chanel;
        this.volume = volume;
        this.control = false;
    }

    @Override
    public void turnOff() {
       if (control ){
           control = false;
       }
    }

    @Override
    public void turnOn() {
        if (!control){
            control = true;
            System.out.println("Телевизор включен");
        }

    }

    @Override
    public String getDeviceStatus() {
        if (control){
            return "Телевизор включен на канале "+ chanel+" с громкостью "+ volume;
        }else {
            return "Телевизор выключен";
        }

    }
}
