package lesson6hw;

public class Task25YasyuchenyaMain {

    /*Создать класс и объекты описывающие Банкомат. Набор купюр находящихся вбанкомате должен задаваться тремя свойствами:
    количеством купюр номиналом 20 50 100. Сделать методы для добавления денег в банкомат.
    Сделать функцию снимающую деньги. На вход передается сумма денег. На выход – булевское значение (операция удалась или нет).
    При снятии денег функция должна рапечатывать каким количеством купюр какого номинала выдается сумма.
    Создать конструктор с тремя параметрами – количеством купюр.
     */

        public static void main(String[] args) {

            Task25 term = new Task25(10, 10, 10);
            Task25 term2 = new Task25(10, 10, 10);

            System.out.println(term.papper20 + " " + term.papper50 + " " + term.papper100);
            term.add(20, 0, 0);
            System.out.println(term.papper20 + " " + term.papper50 + " " + term.papper100);


            term.moneyGet(170);
            System.out.println(term.papper20 + " " + term.papper50 + " " + term.papper100);

        }
    }
