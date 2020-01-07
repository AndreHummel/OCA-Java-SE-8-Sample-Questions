/**
 * What is the result?
 *
 * A. a = 11 b = 19
 *    a = 11 b = 18
 *
 * B. a = 11 b = 19
 *    a = 12 b = 19
 *
 * C. a = 11 b = 19
 *    a = 12 b = 18
 *
 * D. a = 11 b = 19
 *    a = 11 b = 19
 *
 * E. Compilation fails
 */

public class Q125 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if(++a >= 10 && --b < 20) {
            System.out.println("a = " + a + " b = " + b);
        }

        if(++a >= 10 & --b < 20) {
            System.out.println("a = " + a + " b = " + b);
        }
    }
}
