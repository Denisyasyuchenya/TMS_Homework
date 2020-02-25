package Homework;

import java.util.Random;

public class Task8Yasyuchenya {
    public static void main(String[] args) {
        /*Имеется целое число (задать с помощью Random rand = new Random(); int x =
        rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
        нему слово «рублей» в правильном падеже.*/
        Random rand = new Random();
        int randRub = rand.nextInt(1000000);
        if (randRub % 10 == 1 && randRub % 100 != 11) {
            System.out.println(randRub + " Рубль");
        } else if (randRub % 10 >= 2 && randRub % 10 <= 4 && (randRub % 100 < 10 || randRub % 100 >= 20)) {
            System.out.println(randRub + " Рубля");
        }else{
            System.out.println(randRub + " Рублей");
        }
    }
}