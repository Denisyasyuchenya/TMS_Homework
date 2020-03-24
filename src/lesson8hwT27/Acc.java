package lesson8hwT27;

    public abstract class Acc {
        protected Boolean statAcc = true;
        protected String ownOfAcc;

        public void setStatAcc(Boolean statusAccount) {
            this.statAcc = statusAccount;
        }

        public void setOwnOfAcc(String personOfAccount) {
            this.ownOfAcc = personOfAccount;
        }

        public Boolean getStatAcc() {
            return statAcc;
        }

        public String ownOfAcc() {
            return ownOfAcc;
        }

        abstract void getMoney(int sum);
        abstract void putMoney();

        public void closeAcc(){
            statAcc=false;
        }
    }
