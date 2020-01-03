/**
 * What is the result?
 *
 * A. 10 Hello World!
 *
 * B. Hello Universe!
 *
 * C. Hello World!
 *
 * D. Compilation fails
 *
 */

public class Q76 {
    public static void main(String[] args) {
        int aVar = 9;
        if (aVar < 10) {
            System.out.println(aVar + " Hello World!");
        } else {
            System.out.println(aVar + " Hello Universe!");
        }
    }
}
