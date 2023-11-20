package OOP.AbstractClass;

public class Tomogochi  extends ElectronicDevice{

    int next;
    int previous;

    public Tomogochi(int next, int previous) {
        this.next = next;
        this.previous = previous;
        this.control = false;
    }

    @Override
    public void turnOff() {
        if (control){
            control = false;
        }

    }

    @Override
    public void turnOn() {
        if (!control){
            control = true;
        }

    }

    @Override
    public String getDeviceStatus() {
        if (control) {
            return next + " turn ";
        } else {
            return "device are off";
        }

    }

}
