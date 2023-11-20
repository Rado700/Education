package variables;

public class DataType {
    public static void main(String[] args) {
        boolean isOpen = true;

        byte a = 3; // -128 127 1 байт
        short b = 3100; //-32768    32767 2 байта
        int c = 10; //-2 * 10^9   2*10^9 4 байта
        long l = -10_000_230; //-9 * 10^18  9 * 10^18 8 байт
        int num = 0x6A;
        int num2 = 0b1010101;

        float x = 8.5F; // -3.4 * 10^-38    3.4 * 10^38  4 байта
        double y = 8.5; // -4.9 * 10^-324     1 * 10^308   8 байт

        char ch = '!';
        char ch2 = 102;
        System.out.println(ch2);

        String str = """
                Hi
                Ok
                """;
    }

}
