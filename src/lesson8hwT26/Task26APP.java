package lesson8hwT26;

public abstract class Task26APP {

        protected int power;
        protected String comeFrom;
        protected String model;

        public int getPower() {
            return power;
        }

        public String getModel() {
            return model;
        }

        public String getcomeFrom(){return comeFrom; };

        public void setPower(int power) {
            this.power = power;
        }

        public void setComeFrom(String comeFrom) {
            this.comeFrom = comeFrom;
        }

        public void setModel(String model) {
            this.model = model;
        }

        abstract void powerOn();
        abstract void getComeFrom();

    }
