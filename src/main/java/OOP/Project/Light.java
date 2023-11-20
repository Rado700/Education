package OOP.Project;

import java.util.UUID;

public class Light extends Device {
    private int brightness;
    private String color;


    public Light(int brightness, String color) {
        super();
        this.brightness = brightness;
        this.color = color;
        this.setType(DeviceType.LIGHT);
    }

    void dim(int level) {
        if (level >= 10) {
            System.out.println("Нельзя установить больше 10");
            return;

        } else if (level <= 0) {
            System.out.println("Нельзя убавить");
            return;
        } else
            this.brightness = level;


    }

    void changeColor(String color) {
        String possibleSymbols = "0123456789ABCDEF";

        if (color.length() != 7 && color.charAt(0) != '#') {
            System.out.println("Не верный формат цвета");
            return;
        }

        for (int i = 1; i < color.length(); i++) {
            if (possibleSymbols.indexOf(color.charAt(i)) == -1) {
                System.out.println("Не верный формат цвета");
                return;
            }
        }


        this.color = color;
    }

    @Override
    void turnOn() {
        setStatus(DeviceStatus.ON);
    }

    @Override
    void turnOff() {
        setStatus(DeviceStatus.OFF);
    }

    String getStatus() {
        return this.status.getDescription();

    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Light{" +
                "brightness=" + brightness +
                ", color='" + color + '\'' +
                ", status=" + status +
                '}';
    }
}
