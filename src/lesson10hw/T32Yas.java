package lesson10hw;

import java.util.HashMap;
import java.util.Scanner;

public class T32Yas {
    public static void main(String[] agrs){
        System.out.println("Введите текст");
        Scanner in = new Scanner(System.in);
        Integer m=1;
        String string = in.nextLine();
        String[] words = string.split("\\s+");
        HashMap<String, Integer> wordToCount = new HashMap<>();
        for (String word : words)
        {
            if (!wordToCount.containsKey(word))
            {
                wordToCount.put(word,m);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }
        for (String word : wordToCount.keySet())
        {
            System.out.println(word + " " + wordToCount.get(word));
        }
    }
}
