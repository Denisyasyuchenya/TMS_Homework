package Homework;

public class Task9Yasyuchenya {

    public static void main(String[] args) {

        /* Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
      произведение, т.е. факториал числа.*/

            System.out.println("Факториал: " + factorial((int) (Math.random() * 13)));
        }
        public static int factorial(int f) {
            System.out.print(f + " ");
            if (f == 0) {
                return 1;
            } else {
                return f * factorial(f - 1);
            }
        }
    }
