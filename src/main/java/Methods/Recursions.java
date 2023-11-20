package Methods;

public class Recursions {

  //  public static int fib(int n) { // f(5) = f(4)+ f(3) , f(4) = f(3) + f(2)
//        f(0) = 0, f(1) = 1
//        if (n == 0 || n == 1) {
//            return n;
//        } else {
//            return fib(n - 1) + fib(n - 2);
//        }
 //   }

    public static void main(String[] args) {
  //      System.out.println(fib(3));
        System.out.println(ff(5));

        System.out.println(ss(12345));
        // ss(1234) = 1 + 1 + 1 + 1
        // ss(123) =1 + 1 + 1
        // ss(12) = 1 + 1
        // s(1) = 1
    }

    public static int ff(int m){
        if (m == 1){
            return 1;
        }
        return m * ff(m-1);
    }
    public static int ss(int n) {
        if (n / 10 == 0) {
            return 1;
        } else {
            return ss(n / 10)+1 ;
        }
    }


}
