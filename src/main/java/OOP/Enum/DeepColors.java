package OOP.Enum;

public enum DeepColors {
    RED("#00223FF"),
    BLUE("#0000FF"),
    GREEN("#00FF00");
    private String code;

    DeepColors(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "DeepColors{" +
                "code='" + code + '\'' +
                '}';
    }
}
