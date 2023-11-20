package Exceptions;

import com.sun.security.auth.NTNumericCredential;

import java.util.Arrays;

public class Basic {
    public static void main(String[] args) {

        try {
            System.out.println(s(1,-1));
           int [] a = new int[3];
 //           System.out.println(a[10]);
            int s = Integer.parseInt("sss");
            System.out.println("OK");
        }catch ( ArithmeticException ae){ // возваращает какую ошибку произвел(Арифметическая)
 //           System.out.println("Ошибка");
        } catch (ArrayIndexOutOfBoundsException bo){
//            System.out.println(Arrays.toString(bo.getStackTrace()));
        } catch (Exception e){
//            System.out.println(e.getClass());   // описывает основную ошибку
//            System.out.println(e.getMessage()); //прописывает значение ошибки
 //                      System.out.println(Arrays.toString(e.getStackTrace())); // проиописывает весь путь ошибки
        } finally {   // печатает в любом случае
 //           System.out.println("All time will be print this");
        }
        System.out.println("gg");


    }
    public static int s(int a , int b){
        if (a < 0 || b < 0){
            throw new NumberFormatException("Отрицательное число");
        }
        int s = a / b;
        return s;
    }
}
