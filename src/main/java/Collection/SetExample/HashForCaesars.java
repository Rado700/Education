package Collection.SetExample;

public class HashForCaesars {
    public static void main(String[] args) {
        System.out.println(change("ZABC"));
    }

    public static String change(String litter){

        String result = "";
        for (int i = 0; i < litter.length(); i++) {
            char c = litter.charAt(i);
            if (c >= 65 && c <= 90) {
                c -= 3;
                if (c < 65){
                    c+= 26;
                }
            }
            result += String.valueOf(c);

        }

        return result;
    }
}
