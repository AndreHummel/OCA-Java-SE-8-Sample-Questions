/**
 * What is the result?
 *
 * A. A B D C
 *
 * B. A B C D
 *
 * C. A B C C
 *
 * D. A
 */

public class Q124 {
    public static void main(String[] args) {
        String ta = "A ";
        ta = ta.concat("B ");
        String tb = "C ";
        ta = ta.concat(tb);
        ta.replace('C', 'D');
        ta = ta.concat(tb);
        System.out.println(ta);

    }
}
