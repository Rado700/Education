package Methods;

public class Basic {


//
//    static int summa(int a, int b) {
//        int result = (a + b) / 2;
//        return result;
//    }
//
//    static int number(int[] a) {
//        int sA = 0;
//        for (int i = 0; i < a.length; i++) {
//            sA += a[i];
//        }
//
//        return sA / a.length;
//    }
//
//
    //Содержит ли строка цифру

//    public static boolean isOmega(String numbers) {
//        char[] chars2 = numbers.toCharArray();
//        for (char s : chars2) {
//            if (Character.isDigit(s)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    //Проверить содержит ли строка буквы
//
//    public static boolean isAlpha(String name) {
//        char[] chars = name.toCharArray();// ['a','b','c']
//        for (char c : chars) {
//            if (Character.isLetter(c)) {
//                return true;
//            }
//        }
//
//        return false;
//    }
//
//
//    //Проверка пароля на цифры и буквы
//
//    public static boolean checkParol(String parol) {
//        int number = 8;
//        if (parol.length() < number) {
//            return false;
//        } else if (!isAlpha(parol)) {
//            return false;
//        } else if (!isOmega(parol))
//            return false;
//
//        return true;
//    }


    // Подсчет пар элементов равные друг другу

//    public static int NumberCont(int ... a) {
//        int NumCount = 0;
//
//        for (int i = 0; i < a.length; i++) {
//            for (int j = i +1 ; j < a.length; j++){
//                if (a[i] == a[j]){
//                    NumCount++;
//                }
//            }
//
//        }
//        return NumCount;
//    }

    //
//    static String day (int hours, int minutes){
//
//      if (hours >= 24 || hours < 0 || minutes > 61 || minutes <0){
//          return "неверное время";
//      }
//      else if (hours >= 21 || hours <= 6){
//          return "Night";
//      }
//      else if (hours > 7 && hours < 12) {
//          return "Morning";
//
//      } else if (hours > 12 && hours < 17) {
//          return "AfterNoon";
//      }
//
//      return "Evening";
//    }
//
//    static String hello (String name ){
//        return   "hi " + name ;
//    }
//    static String hello (String name ,String Famaly ){
//        return "Good day " + name +" "+ Famaly;
//    }
//
//
//
//    //Перегрузка метода
//    static int sumToVar(String message, int ...a){
//        System.out.println(message);
//        int s = 0;
//        for (int i = 0; i < a.length; i++) {// [1,2,3,4,5,6]
//
//            s += a[i];
//        }
//        return s;
//    }
//    static int sumToVar(int a, int b) {
//        int res = a + b;
//        return res;
//    }
//
//    static double sumToVar(double a, double b){
//        return  a + b;
//    }
//////////////////////////////////
//    static boolean digital(String digitals) {
//        char[] charA = digitals.toCharArray();
//        for (char c : charA) {
//            if (Character.isDigit(c)) {
//                return true;
//            }
//
//        }
//        return false;
//    }
//
//    static boolean letter(String letters) {
//        char[] charB = letters.toCharArray();
//        for (char s : charB) {
//            if (Character.isLetter(s)) {
//                return true;
//            }
//
//        }
//        return false;
//    }

    static boolean abc(String letters) {

        try {


            String[] eng = {"qwertyuiop asdfghjkl zxcvbnm"};//-2
            String[] rus = {"йцукенгшщзхъ фывапролджэ ячсмитьбю"};//-2

            int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

            if (letters.length() > 8) {
                throw new ArithmeticException("Нужнo не больше 8 знаков");
            }


            for (String pullEng : eng) {
                for (int i = 0; i < letters.length() + 10; i++) {
                    String pull = pullEng.substring(i, i + 3);
                    if (letters.contains(pull)) {
                        throw new ArrayIndexOutOfBoundsException("Последовательность не должна превышать больше 3 букв");
                    }
                }

            }
            for (String pullRus : rus) {
                for (int i = 0; i < letters.length() + 10; i++) {
                    String pull = pullRus.substring(i, i + 3);
                    if (letters.contains(pull)) {
                        throw new ArithmeticException("Последовательность должна не превышать трех букв");
                    }
                }

            }

            for (int i = 0; i < letters.length(); i++) {
                String rusCopy = letters.toLowerCase();
                if (letters.contains(rusCopy)) {

                    throw new ArithmeticException("Нужно одну заглавну Букву");
                }
            }

            return true;

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException ae) {
            System.err.println(ae);
            return false;
        }
        //   System.out.println("Пароль прошел все отлично");
    }

    public static boolean isDigital(String one) {
        try {
            char[] charA = one.toCharArray();
            for (char c : charA) {
                if (Character.isDigit(c)) {
                    return true;
                }
            }
            throw new ArithmeticException("Нужна хотя бы одна цифра");
        } catch (ArithmeticException ax) {
            System.out.println("Нужна одна цифра");
        }
        return false;
    }

    public static boolean isLetters(String lets) {
        try {
            char[] charB = lets.toCharArray();
            for (char c : charB) {
                if (Character.isLetter(c)) {
                    return true;
                }
            }
            throw new ArrayIndexOutOfBoundsException("Нужна хотя бы одна cтрочная буква");

        } catch (ArithmeticException ax) {
            System.out.println("Буква");

        }
        return false;
    }

    public static boolean abcABC(String bukva) {
        try {
            int count = 0;
            char[] charB = bukva.toCharArray();
            for (char c : charB) {
                if (Character.isLetter(c)) {
                    count++;


                    if (count == 3) {
                        return true;
                    }
                }
            }
        } catch (ArithmeticException ar) {
            System.out.println("Последовательность");
        }
        throw new ArrayIndexOutOfBoundsException("Нужно хотя бы 3 буквы");

    }


    public static boolean parolOk(String prl) {
        int sum = 5;
        if (prl.length() < sum) {
            return false;
        }
        if (!isLetters(prl)) {
            return false;
        } else if (!isDigital(prl)) {
            return false;
        } else if (!abc(prl)) {
            return false;
        } else if (!abcABC(prl)) {
            return false;
        }
        System.out.println("Хароший пароль");
        return true;

    }


    static String numbers(String w) {

        try {

            String n = w.replaceAll("[^a-zA-Z0-9]", "");
            String subStrim = n.substring(1);
            if (subStrim.length()>= 11){
                return ("Нужно не больше 11 цифр");
            }
            int[] mas = {+7};
            if (!mas.equals(subStrim)) {
                return "+7" + subStrim;
            }
        } catch (Exception e) {
            System.out.println(e);
        }


        return "Неверный номер";
    }

    static int number(String n) {
        String num = n.replaceAll("[^a-zA-Z0-9]", "");


        return 0;
    }

    public static boolean paroldress(String dress) {
        if (dress.length() > 11) {
            return false;
        }


        return false;
    }





//////////////////////////////
    public static void main(String[] args) {
      //  System.out.println(abc("21234a6D"));
        //      System.out.println(parolOk("eqhedAh"));
       System.out.println(numbers(String.valueOf("+7(917)777-9-333")));
        //       System.out.println(NumberCont(123451));
        //       System.out.println(sumToVar("Hi", 1,2,4,5,6));
        //        sumToVar(1,2);
        //        sumToVar(2.3,4.2);
        //        sumZnach(1,2,3,4,5);


        //        System.out.println(NumberCont(1,1,1,1,1));
        //       System.out.println(hello("Petya" ,"Ivanovich"));


//                System.out.println(sumToVar(5,6));
//        System.out.println(summa(10,20));
        //               System.out.println(number(new int[]{1, 2, 3, 4, 5}));
        //     System.out.println(checkParol("1 Б 2 3 4 5 6 0"));


    }
}

