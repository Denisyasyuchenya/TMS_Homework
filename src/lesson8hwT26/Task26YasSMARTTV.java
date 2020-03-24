package lesson8hwT26;

public class Task26YasSMARTTV extends Task26YasTV {
        private String typeOfSmartTv;

        public void setTypeOfSmartTv(String typeOfCapuchinator) {
            this.typeOfSmartTv = typeOfCapuchinator;
        }

        public String getTypeOfSmartTv() {
            return typeOfSmartTv;
        }

        public Task26YasSMARTTV(int power, String comeFrom, String model,
                                          int cableTv, String typeOfSmartTv){
            super(power,comeFrom,model,cableTv);
            this.typeOfSmartTv=typeOfSmartTv;
        }

        @Override
        public void powerOn(){
            System.out.println("██████████████████████████████████████████\n" +
                    "██══════════════════════════════════════██\n" +
                    "██══════════════════════════════════════██\n" +
                    "██              SAMSUNG                 ██\n" +
                    "██══════════════ Smart ═════════════════██\n" +
                    "██════════════════ TV ══════════════════██\n" +
                    "██══════════════════════════════════════██\n" +
                    "██══════════════════════════════════════██\n" +
                    "██████████████████████████████████████████\n" +
                    "                  ████\n" +
                    "             ██████████████");
        }

        @Override
        public String toString() {
            return super.toString()+"Task26YasSMARTTV{" +
                    "typeOfSmartv='" + typeOfSmartTv + '\'' +
                    '}';
        }
    }