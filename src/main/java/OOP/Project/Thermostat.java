package OOP.Project;

import java.util.UUID;

public class Thermostat extends Device{

    private float temperature;
    private float targetTemperature;
    private float minTemperature;
    private float maxTemperature;


    public Thermostat(float temperature, float targetTemperature, float minTemperature, float maxTemperature) {
        super();
        setTemperature(temperature);
        this.targetTemperature = targetTemperature;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
        this.setType(DeviceType.THERMOSTAT);


    }

    public Thermostat(float temperature, float minTemperature, float maxTemperature) {
        super();
        setTemperature(temperature);
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
        this.setType(DeviceType.THERMOSTAT);

    }

    void setTemperature(float temperature){
        this.temperature = temperature;

        if (temperature > 30){
            System.out.println("Температура слишком высокая");
        }
        if (temperature < 0){
            System.out.println("Температура слишком низкая");
        }

    }
    float getTemperature(){
       return this.temperature;
    }

    @Override
    void turnOn() {
        setStatus(DeviceStatus.ON);
        System.out.println("Thermostat on");
    }

    @Override
    void turnOff() {
        setStatus(DeviceStatus.OFF);
        System.out.println("Thermostat off");
    }

    String getStatus(){
        return this.status.getDescription() +" "+ getTemperature();
    }

    public float getTargetTemperature() {
        return targetTemperature;
    }

    public void setTargetTemperature(float targetTemperature) {

        if (targetTemperature < 25 && targetTemperature > 20 ){
            return;
        }
        this.targetTemperature = targetTemperature;
    }

    public float getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(float minTemperature) {
        if (minTemperature < 30 && minTemperature > 10){
            return;
        }
        this.minTemperature = minTemperature;
    }

    public float getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(float maxTemperature) {
        if (maxTemperature < 35 && maxTemperature >20){
            return;
        }
        this.maxTemperature = maxTemperature;
    }

    @Override
    public void setType(DeviceType type) {
        super.setType(type);
    }

    @Override
    public DeviceType getType() {
        return super.getType();
    }

    @Override
    public String toString() {
        return "Thermostat{" +
                "temperature=" + temperature +
                ", targetTemperature=" + targetTemperature +
                ", minTemperature=" + minTemperature +
                ", maxTemperature=" + maxTemperature +
                ", status=" + status +
                '}';
    }
}
