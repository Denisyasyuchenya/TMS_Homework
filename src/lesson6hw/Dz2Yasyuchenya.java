package lesson6hw;

public class Dz2Yasyuchenya {

    /*2) Заменить все вхождения символа стоящего в позиции 3 на символ стоящий в позиции 0*/

    public static void main (String[] args) {
        String str5 = new String("Пиратам не нужны науки\n" +
                "И это ясно почему:\n" +
                "У нас и ноги есть, и руки\n" +
                "А голова нам ни к чему.");
        System.out.println(str5);
        String newString = new String("");

        newString = str5.replace(str5.charAt(3), str5.charAt(0));
        System.out.println(newString);
        System.out.println("███████████████\n" +
                "███═════════▐██ \n" +
                "█▌═══════════▐█ \n" +
                "█═█▄═══█▄═▐▀══█ \n" +
                "█═██▐█═██═▐▄══▐ \n" +
                "█▄▄═▐█═══▐═══██ \n" +
                "███▌▌▌▌▌▌▐══███ \n" +
                "███▌▌▌▌▌▌▌═▐███ \n" +
                "███═▄▄════▄████\n" +
                "███████████████\n" +
                "Boooooooooooooo!");
    }
}

