package Collection.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class NewPractic {
    public static void main(String[] args) {

        System.out.println(Rim("IVX"));

    }
    public static Integer Rim (String number){
        Map<Character,Integer>newRimDigit = new HashMap<>();
        newRimDigit.put('I',1);
        newRimDigit.put('V', 5);
        newRimDigit.put('X',10);
        newRimDigit.put('L',50);
        newRimDigit.put('C',100);
        newRimDigit.put('D',500);
        newRimDigit.put('M',1000);

        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            if (i < number.length()-1 && newRimDigit.get(number.charAt(i)) <newRimDigit.get(number.charAt(i+1))){
                sum -= newRimDigit.get(number.charAt(i));

            }else sum += newRimDigit.get(number.charAt(i));

        }
        return sum;
    }
}
