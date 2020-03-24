package lesson8hwT27;

public class CardRunner {
    public static void main(String[] args) {
        Acc acc = new AccCon(111000,"Igor","eu");
        Acc bankCard = new Card(20000, "Kolya", "by",
                "no nfc");
        Acc acc1 = new AccCon(34, "Sergey", "rub");

        //AccCon.getMoney(100);
        //AccCon.putMoney();
        bankCard.getMoney(200);
        bankCard.putMoney();
        //AccCon.putMoney(34500);
        //AccCon.getMoney();
    }
}
