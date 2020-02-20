package Homework;

public class Task17Yasyuchenya {
    public static void main (String[] args){
        int[][] arr = new int[21][21];

        for (int a = 0; a < arr.length / 2 + 1; a++) {
            for (int b = 0; b < arr[a].length; b++) {
                if ((b < a) || (b >= (arr[a].length - a)))
                    arr[a][b] = 0;
                else
                    arr[a][b] = 1;
            }
        }

        for (int a = arr.length - 1; a >= arr.length / 2 + 1; a--) {
            for (int b = 0; b < arr[a].length; b++) {
                if ((b < (arr[a].length - 1 - a)) || (b > a))
                    arr[a][b] = 0;
                else
                    arr[a][b] = 1;
            }
        }

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println(" ");
        }
    }
}

