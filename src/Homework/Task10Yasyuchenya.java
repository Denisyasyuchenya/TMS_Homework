package Homework;

public class Task10Yasyuchenya {

    public static void main(String[] args) {
        /* Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).*/
        int to = 15;
        System.out.println(factorial(to));
    }

    public static int factorial(int f) {
        int from = 10;
        int result = 1;
        for (int i = from; i <= f; ++i) result *= i;
        return result;
    }
}
