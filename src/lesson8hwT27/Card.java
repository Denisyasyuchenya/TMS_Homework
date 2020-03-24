package lesson8hwT27;

    public class Card extends AccCon {
        private String cardType;

        public void setcardType (String cardType) {
            this.cardType = cardType;
        }

        public String getcardType() {
            return cardType;
        }

        public Card(int balance, String ownOfAcc, String currency, String cardType){
            super(balance, ownOfAcc, currency);
            this.cardType=cardType;
        }
        @Override
        public void getMoney(int sum){
            System.out.println("Заберите деньги в банкомате " + sum +" " + currency);
        }

    }
