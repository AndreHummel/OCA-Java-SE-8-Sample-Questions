/**
 * Given the requirements:
 *
 * If the value of the qty variable is greater than or equal to 90, discount = 0.5
 *
 * If the value of the qty variable is between 80 and 90, discount = 0.2
 *
 *
 * Which two code fragments can be independently inserted to meet the requirement?
 */

public class Q005 {
    public static void main(String[] args){
        double discount = 0;
        int qty = Integer.parseInt(args[0]);

        /** OPTION A */
//        if (qty >= 90) {discount = 0.5;}
//        if (qty > 80 && qty < 90) {discount = 0.2;}

        /** OPTION B */
//        discount = (qty >= 90) ? 0.5 : 0;
//        discount = (qty > 80) ? 0.2 : 0;

        /** OPTION C */
//        discount = (qty >= 90) ? 0.5 : (qty > 80) ? 0.2 : 0;

        /** OPTION D */
//        if (qty > 80 && qty < 90){
//            discount = 0.2;
//        } else {
//            discount = 0;
//        }
//        if (qty >= 90){
//            discount = 0.5;
//        } else {
//            discount = 0;
//        }
        System.out.println(discount);
    }
}
