package lesson6hw;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task22Yasyuchenya {

    /* Написать программу,выполняющую поиск в строке шестнадцатеричных чисел,
    записаных по правилам Java,спомощью регулярных выражений и вывести их на страницу.
     */
    public static void main (String[] args){
        String str2 = new String();
        str2 = "У нас на ферме 678989 гусей и 789098 кур.";

        Pattern p = Pattern.compile("-?[0-9]\\d{5}+");
        Matcher m = p.matcher(str2);

        while(m.find()) {

            System.out.println(m.group());
        }
    }
}
