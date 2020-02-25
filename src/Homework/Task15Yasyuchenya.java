package Homework;

public class Task15Yasyuchenya {

    public static void main(String[] args) {

        /* Создать массив, заполнить его случайными элементами, распечатать,
       перевернуть, и снова распечатать (при переворачивании нежелательно создавать
       еще один массив).*/

                int[] array = new int[20];
                for (int u = 0; u < array.length; u++) {
                    array[u] = (int) Math.round((Math.random() * 100));
                }

                for (int item : array) {
                    System.out.print(item + " ");
                }
                System.out.println(" ");
                int n = array.length;

                for (int u = 0; u < n / 2; u++) {
                    int temp = array[n - u - 1];
                    array[n - u - 1] = array[u];
                    array[u] = temp;
                }

                for (int value : array) {
                    System.out.print(value + " ");
                }
            }
        }
