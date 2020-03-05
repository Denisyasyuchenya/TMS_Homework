package lesson5hw;

import java.util.Scanner;

public class Task20Yasyuchenya {
    public static void main (String[] args){
    /*Имеется строка с текстом. Вывести текст, составленный из последних букв
    всех слов.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любую фразу: ");
        String sent = sc.nextLine();

        sent = sent.replaceAll("[!.,:;-]", "");

        String[] words = sent.split(" ");
        StringBuilder newSentence = new StringBuilder();

        for(String word : words) {
            newSentence.append(word.charAt(word.length()-1));
        }

        System.out.println(newSentence);
        sc.close();
    }
}
