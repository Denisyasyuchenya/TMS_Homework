package lesson8hwT27;

public class AccCon extends Acc {
    protected String currency;
    protected int balance;

    public AccCon (int balance, String ownOfAcc, String currency){
        this.balance=balance;
        this.ownOfAcc=ownOfAcc;
        this.currency = currency;
    }
    @Override
    void getMoney(int sum){
        System.out.println("Возьмите деньги: " + sum +" " + currency);
    }


    @Override
    void putMoney() {
        System.out.println("Положите деньги.");
    }
}
