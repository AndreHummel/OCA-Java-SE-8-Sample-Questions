/**
 * Which three lines, when inserted independently, cause the program to print a 0 balance?
 */

public class Q017 {
    public static void main(String[] args){
        CheckingAccount acct = new CheckingAccount((int) Math.random()*1000);
        /** OPTION A */
//        this.amount = 0;

        /** OPTION B */
//        amount = 0;

        /** OPTION C */
//        acct (0) ;

        /** OPTION D */
//        acct.amount = 0;

        /** OPTION E */
//        acct. getAmount () = 0;

        /** OPTION F */
//        acct.changeAmount(0);

        /** OPTION G */
//        acct.changeAmount(-acct.amount);

        /** OPTION H */
//        acct.changeAmount(-acct.getAmount());

        System.out.println(acct.getAmount());
    }
}

class CheckingAccount{
    public int amount;
    public CheckingAccount(int amount){
        this.amount=amount;
    }

    public int getAmount(){
        return amount;
    }

    public void changeAmount(int x){
        amount += x;
    }
}
