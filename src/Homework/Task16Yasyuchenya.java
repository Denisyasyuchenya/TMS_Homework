package Homework;

public class Task16Yasyuchenya {

    public static void main(String[] args) {

        /*  Определите сумму элементов одномерного массива, расположенных между
          минимальным и максимальным значениями.*/

        int[] array = new int[10];
        for (int f = 0; f < array.length; f++) {
            array[f] = (int) Math.round((Math.random() * 100));
        }
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println("\nСумма эелементов между минимальным и максимальным значением = " + getSumBetweenMinAndMax(array));
    }

    public static int getSumBetweenMinAndMax(int[] array) {
        int minVal = 0;
        int maxVal = 0;
        int result = 0;
        for (int f = 1; f < array.length; f++) {
            minVal = array[f] < array[minVal] ? f : minVal;
            maxVal = array[f] > array[maxVal] ? f : maxVal;
        }
        for (int i = Math.min(minVal, maxVal); i <= (Math.max(minVal, maxVal)); i++)
            result += array[i];
        return result;
    }
}
