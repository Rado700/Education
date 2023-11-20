package OOP.Project;

import java.util.UUID;

public abstract class Device {

    private UUID deviceId;
    private String name;
    protected DeviceStatus status;
    private DeviceType type;
    private boolean isConnected;


    public Device() {
        this.setStatus(DeviceStatus.OFF);
        this.setDeviceId(UUID.randomUUID());
    }

    abstract void turnOn();

    abstract void turnOff();

    abstract String getStatus();

    void connect() {
        isConnected = true;
        System.out.println("Устройство подключенно" + name);
    }

    void disconnect() {
        isConnected = false;
        System.out.println("Устройство отключено" + name);

    }

    public void setStatus(DeviceStatus status) {
        if (this.status == status) {
            if (this.status == DeviceStatus.ON) {
                System.out.println("this is on");
            } else if (this.status == DeviceStatus.OFF) {
                System.out.println("this is off");
            } else {
                System.out.println("В ожиданий");
            }
        }
        this.status = status;

    }

    public void setType(DeviceType type) {
        this.type = type;
    }

    public DeviceType getType() {
        return type;
    }

    public UUID getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(UUID deviceId) {
        this.deviceId = deviceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isConnected() {
        return isConnected;
    }

    @Override
    public String toString() {
        return "Device{" +
                "deviceId=" + deviceId +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", type=" + type +
                ", isConnected=" + isConnected +
                '}';
    }

}
