package OOP.Enum.Game;

public enum GamePlatform {

    PLAYSTATION("PlayStation","Sony"),
    XBOX("Xbox","Microsoft"),
    NINTENDOSWITCH("NintendoSwitch","Nintendo"),
    PC("Pc","Microsoft");

    private String platformName;

    private String manufacture;

    GamePlatform(String platformName, String manufacture) {
        this.platformName = platformName;
        this.manufacture = manufacture;
    }

    @Override
    public String toString() {
        return "Игры доступные на платформе :" +
                 platformName + '\n' +
                "Производитель: " + manufacture + '\n';
    }
}
