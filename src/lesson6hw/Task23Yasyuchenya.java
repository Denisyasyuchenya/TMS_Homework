package lesson6hw;

public class Task23Yasyuchenya {

    /*Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
      которых есть параметры, например <p id=”p1”>, и замену их на простые теги абзацев <p>.*/
    public static void main(String[] args) {

        String str3 = new String();

        str3 = "Саня <p id=”p1”> Вася <p id=”p1”> Петя <p>  Сирожа ";

        System.out.println(str3.replaceAll("<p> | <p id=”p1”>", " <p>"));
    }
}
