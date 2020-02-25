package Homework;

import java.util.Scanner;

public class Task6Yasyuchenya {
    public static void main(String[] args) {
        /*Создайте число. Определите, является ли число трехзначным. Определите, является
        ли его последняя цифра семеркой. Определите, является ли число четным.*/
        System.out.println("Введите ваше число: ");
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        System.out.println("Ваше число - " + x);
        int stringToInteger = Integer.parseInt(x);
        if (x.length() == 3) {
            System.out.println(x + " - трехзначное.");
        }else{
            System.out.println(x + "не трехзначное.");
        }
        if (stringToInteger % 2 == 0) {
            System.out.println(x + "- четное.");
        }else{
            System.out.println(x + "- не четное.");
        }
        if (x.charAt(x.length() - 1) == '7') {
            System.out.println("Последняя цифра этого числа 7.");
        }
        scanner.close();
    }
}

