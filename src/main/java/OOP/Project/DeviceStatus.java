package OOP.Project;

enum DeviceStatus {
    ON("Включено"),
    OFF("Выключено"),
    STANDBY("В ожиданий");

    private String description;

    DeviceStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
