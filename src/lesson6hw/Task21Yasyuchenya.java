package lesson6hw;

import java.util.Scanner;

public class Task21Yasyuchenya {

    public static void main(String[] args) {

    /* Напишите три цикла выполняющих многократное сложение строк, один с
помощью оператора сложения и String, другой с помощью StringBuilder и метода
append, а также аналогино для StringBuffer. Сравните скорость их выполнения.
    */
        System.out.print("Введите любое слово или предложение: ");
        Scanner sc1 = new Scanner(System.in);
        String a = sc1.nextLine();
        System.out.println(a);
        String stringResult = new String(a);
        StringBuffer bufferResult = new StringBuffer(a);
        StringBuilder builderReslt = new StringBuilder(a);

        System.out.print("Введите любое целое число до 999: ");
        Scanner sc2 = new Scanner(System.in);
        int num = sc2.nextInt();

        long startTime = System.nanoTime();
        for (int i = 0; i < num; i++) {

            stringResult += a;
        }
        long finTime1 = System.nanoTime() - startTime;
        System.out.println("Time results ⌚:");
        System.out.println("Str: " + finTime1 + " milliseconds");

        long startTime2 = System.nanoTime();
        for (int i = 0; i < num; i++) {

            bufferResult.append(a);
        }
        long finTime2 = System.nanoTime() - startTime2;

        System.out.println("Strbuff: " + finTime2 + " milliseconds");

        long startTime3 = System.nanoTime();
        for (int i = 0; i < num; i++) {

            builderReslt.append(a);

        }
        long finTime3 = System.nanoTime() - startTime3;
        System.out.println("Strbuild: " + finTime3 + " milliseconds");

        sc1.close();
        sc2.close();


    }
}
