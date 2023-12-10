package Loops.ConditionOperation;

public class LogisticOperation {
    public static void main(String[] args) {
//        a = 1;
//        a == 1;
        boolean compOn = true;
        boolean temp = false;
        // !
        System.out.println(!compOn);
        // and (и)
        System.out.println(compOn && temp);
        // or (или)
        System.out.println(compOn || temp);

        boolean a = true;
        boolean b = true;
        boolean c = true;
        // ! -> () -> &&  -> ||
        // true = 1 (2)
        // false = 0
        // && (и) - *
        // || (или) - +
        // true || false = 1 + 0 = 1 - true
        // true || true = 1 + 1 = 2 - true
        // false && true = 0 * 1 = 0 - false
        boolean x = a || !(a && (b || !c));
        System.out.println(x);
        boolean y = false;
        boolean l = !(x ||!(y && x));
        System.out.println(l);

        int m = 0;
        m += 1;
        System.out.println(m);

        byte x13 = 12;
        String compareto = x13 >= 16 ? "Yes": "No";
        System.out.println(compareto);
    }
}
