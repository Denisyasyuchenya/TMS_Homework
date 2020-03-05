package lesson5hw;

import java.util.Scanner;

public class Task18Yasyuchenya {
    public static void main (String[] args){
     /*Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
        общее их количество.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любую фразу: ");
        String phrase1 = sc.nextLine();
        char sym;
        int y=0;
        for (int i = 0; i <phrase1.length() ; i++) {
            sym=phrase1.charAt(i);
            if (sym=='.' ||sym== ','|| sym=='-' || sym==':' || sym==';' ||
                    sym=='!' || sym=='"' || sym=='?' ) {
                y++;
            }
        }
        System.out.println( y + " - количество знаков пунктуации в вашей фразе!");
        sc.close();
    }
}