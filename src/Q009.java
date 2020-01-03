/**
 * How should you write methods in the ElectricAccount class so that the member variable bill is always equal to the value of the member variable kwh multiplied by the member variable rate?
 *
 * Any amount of electricity used by a customer (represented by an instance of the customer class) must contribute to the customer's bill (represented by the member variable bill) through the method useElectricity method.
 * An instance of the customer class should never be able to tamper with or decrease the value of the member variable bill.
 *
 */

public class Q009 {
}

class Customer{
    ElectricAccount acct = new ElectricAccount();

    public void useElectricity(double kWh){
        acct.addKWh(kWh);
    }
}

class ElectricAccount{
    private double kWh;
    private double rate = 0.07;
    private double bill;

         /** OPTION A */
//        public void addKWh(double kWh){
//            this.kWh += kWh;
//            this.bill = this.kWh*this.rate;
//        }

         /** OPTION B */
//    public void addKWh(double kWh){
//        if(kWh>0) {
//            this.kWh += kWh;
//            this.bill = this.kWh * this.rate;
//        }
//    }

         /** OPTION C */
//        private void addKWh(double kWh){
//            if(kWh>0) {
//                this.kWh += kWh;
//                this.bill = this.kWh * this.rate;
//            }
//        }

        /** OPTION D */
//        public void addKWh(double kWh){
//            if(kWh>0) {
//                this.kWh += kWh;
//                setBill(this.kWh);
//            }
//        }
//
//        public void setBill(double kWh){
//            bill = kWh*rate;
//            }
}
