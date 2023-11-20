package Temp;

import OOP.Encs.Point;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Point point = new Point(1,2);
   //     point.getX() = 2;
        System.out.println(point.getX());


        Random random = new Random();
        String stringNumber = "" ;
        for (int i = 0; i < 8; i++) {
            int randomNumber = random.nextInt(9);
            stringNumber +=Integer.toString(randomNumber);
        }



        System.out.println(stringNumber);

    }
}
