package OOP.References.Example;

public class UserProfile {

    private String username;
    private int accesLevel;
    private int lastLoginTimestamp;

    public UserProfile(String username, int accesLevel, int lastLoginTimestamp) {
        this.username = username;
        this.accesLevel = accesLevel;
        this.lastLoginTimestamp = lastLoginTimestamp;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAccesLevel() {
        return accesLevel;
    }

    public void setAccesLevel(int accesLevel) {
        this.accesLevel = accesLevel;
    }

    public int getLastLoginTimestamp() {
        return lastLoginTimestamp;
    }

    public void setLastLoginTimestamp(int lastLoginTimestamp) {
        this.lastLoginTimestamp = lastLoginTimestamp;
    }
    public UserProfile clone(){
        return new UserProfile(username,accesLevel,lastLoginTimestamp);
    }

    @Override
    public String toString() {
        return "Профиль :" +
                "Имя " + username + '\'' +
                " уровень " + accesLevel +
                " timeStamp" + lastLoginTimestamp ;
    }
}
