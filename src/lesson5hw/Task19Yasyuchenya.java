package lesson5hw;

import java.util.Scanner;

public class Task19Yasyuchenya {
    public static void main (String[] args){
    /*Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
      учесть, что слова могут разделяться несколькими пробелами, в начале и конце
      текста также могут быть пробелы, но могут и отсутствовать.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любую фразу: ");
        String phrase2 = sc.nextLine();
        System.out.println("Ваша фраза " + phrase2);
        char sym2;
        phrase2 = phrase2.trim();
        int r=1;
        for (int i = 0; i <phrase2.length() ; i++) {
            sym2=phrase2.charAt(i);
            if((sym2==' ') && (phrase2.charAt(i+1)!=' ')){
                r++;
            }
        }
        System.out.println("В вашей фразе: " + r +" слов!");
        sc.close();
    }
}