package Homework;

import java.util.Random;

public class Task7Yasyuchenya {
    public static void main(String[] args) {
        /* Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
       полностью закрыть круглой картонкой радиусом r. */
        int min = 1;
        int max = 500;
        int diff = max - min;
        Random rand = new Random();
            int a = rand.nextInt(diff);
            int b = rand.nextInt(diff);
            int radius = rand.nextInt(diff);
            System.out.println("Имеется прямоугольное отверстие размерами " + a + "x" + b + " и круглая картонка с радиосом: " + radius);
            if (radius * radius >= (a * a + b * b) / 4) {
            System.out.println("Картонка с радиусом: " + radius + "см перекрывает прямоугольник " + a + "x" + b);
            } else {
            System.out.println("Картонка с радиусом: " + radius + "см не перекрывает прямоугольник " + a + "x" + b);
            }
        }
    }