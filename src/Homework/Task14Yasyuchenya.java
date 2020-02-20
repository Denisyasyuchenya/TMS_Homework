package Homework;

import java.util.Arrays;

public class Task14Yasyuchenya {

    public static void main(String[] args) {

        /* Создать массив оценок произвольной длины, вывести максимальную и
          минимальную оценку, её (их) номера.*/

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 15));
        }
        int maxV = array[0];
        int minV = array[0];
        int min = array[0];
        int max = array[0];
        int indexForMax = 0;
        int indexForMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxV) {
                maxV = array[i];
            }
            if (array[i] < minV){
                minV = array[i];
            }
            int score = array[i];
            if (max < score) {
                max= score;
                indexForMax = i;
            }
            if (score < min) {
                min = score;
                indexForMin = i;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Максимальная оценка  - " + maxV + " под номером " + indexForMax);
        System.out.println("Минимальная оценка  - " + minV + " под номером " + indexForMin);
    }
}
