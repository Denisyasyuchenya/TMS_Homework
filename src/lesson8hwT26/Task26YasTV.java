package lesson8hwT26;

public class Task26YasTV extends Task26APP {
        protected int cableTV;

        public int getCableTV() {
            return cableTV;
        }

        public void setCableTV(int cableTV) {
            this.cableTV = cableTV;
        }

        public Task26YasTV(int power, String comeFrom, String model, int cableTV){
            this.cableTV=cableTV;
            this.power=power;
            this.comeFrom=comeFrom;
            this.model=model;
        }
        @Override
        void powerOn() {
            System.out.println("████████████████████████████████████████\n" +
                    "██████████░▀▀██████████████▀▀░██████████\n" +
                    "████████████▄░▀▀████████▀▀░▄████████████\n" +
                    "███████████████▄█▀▀▀▀▀▀█▄███████████████\n" +
                    "████████████████▄▄▄▄▄▄▄▄████████████████\n" +
                    "████▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀████\n" +
                    "███░░▄▄█████████████████████▄░░░▄▄░░░███\n" +
                    "███░░█▀░░░░░░░░░░▄▄▄▄█████████░████░░███\n" +
                    "███░░█░░░░░░░▄████████████████░░▀▀░░░███\n" +
                    "███░░█░░░░▄███████████████████░░░░░░░███\n" +
                    "███░░█░░░███В█И█Т█Я█З█Ь███████░░░░░░░███\n" +
                    "███░░█░░██████████████████████░░░░░░░███\n" +
                    "███░░█░███████████████████████░▀███░░███\n" +
                    "███░░█████████████████████████░▄▄▄▄░░███\n" +
                    "███░░█████████████████████████░▄▄▄▄░░███\n" +
                    "███░░▀███████████████████████▀░░▀▀▀░░███\n" +
                    "███▄░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▄███\n" +
                    "████████████████████████████████████████");
        }

        @Override
        void getComeFrom() {
            System.out.println("Made in " + comeFrom);

        }

        @Override
        public String toString() {
            return "CabelTV{" +
                    "cabelTv=" + cableTV +
                    ", power=" + power +
                    ", comeFrom='" + comeFrom + '\'' +
                    ", model='" + model + '\'' +
                    '}';
        }
    }
