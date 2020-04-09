package lesson6hw;

import java.util.Scanner;
import java.util.Random;
import static java.lang.Math.random;

public class Dz1Yasyuchenya {

    /*1) Вырезать подстроку из строки начиная с первого вхождения символа на произвольной позиции
    до последнего вхождения другого символа на произвольной позиции.
    Первый символ должен быть выбран рандомно из первой половины предложения,
    второй - из второй. Если символы совпадают, генерировать пары, пока символы не будут различны.*/

    public static void main(String[] args) {

        System.out.print("Введите любое слово или предложение: ");
        Scanner sc3 = new Scanner(System.in);
        String str4 = sc3.nextLine();
    //    String str4 = new String("It was the first day of school and a new student named Martinez, the son of a Mexican restaurateur, entered the fourth grade.");
        System.out.println(str4 + " - Ваша строка! Ща мы ее расколбасим ⚒.");
        String newString = new String("");
        Random rand = new Random();
        int firstSymbol = 0;
        int secondSymbol = 0;
        int newFirst = 0;
        int newLast = 0;

        for (int i = 0; i < 100; i++) {

            firstSymbol = rand.nextInt(str4.length()/2);
            secondSymbol = rand.nextInt((str4.length() / 2) * 2);
            if (str4.charAt(firstSymbol) != str4.charAt(secondSymbol)) {
                System.out.println(str4.charAt(firstSymbol) + " " + str4.charAt(secondSymbol));
                break;
            }
        }
        newFirst = str4.indexOf(str4.charAt(firstSymbol));
        newLast = str4.lastIndexOf(str4.charAt(secondSymbol));

        System.out.println(newFirst + " " + newLast);

        newString = str4.substring(newFirst, newLast);

        System.out.println(newString);
        sc3.close();
    }
}

