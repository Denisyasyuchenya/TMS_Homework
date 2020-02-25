package Homework;

public class Task12Yasyuchenya {

    public static void main(String[] args) {

        /* Найдите сумму первых n целых чисел, которые делятся на 3.*/

            int nDig = 10;
            int k = 1;
            int sum = 0;
            int i;
            for (i = 1; k <= nDig; i++) {
                if (i % 3 == 0) {
                    sum += i;
                    k++;
                }
            }
            System.out.println("Сумма первых " + nDig + " чисел, которые делятся на три = " +sum);
        }
    }
