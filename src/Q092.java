/**
 * What's the result'?
 *
 * A. 521
 *
 * B. 65321
 *
 * C. 65431
 *
 * D. An Exception is thrown at runtime
 *
 */

public class Q092 {
    public static void main(String args[]) {
        StringBuilder sb1 = new StringBuilder("123456");
        sb1.subSequence(2, 4);
        sb1.deleteCharAt(3);
        sb1.reverse();
        System.out.println(sb1);
    }
}
