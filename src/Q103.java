import java.util.function.*;

/**
 * What's the result:
 *
 * A. match
 *
 * B. not match
 *
 * C. Compiler error on line 8
 *
 * D. Compiler error on line 10.
 *
 * E. Compiler error on line 11.
 *
 * F. A runtime exception is thrown.
 */

public class Q103 {
    int x;

    public static void main(String[] args) {
        Q103 p1 = new Q103();
        p1.x = 1;
        check(p1, p -> p.x < 5);
    }

    private static void check(Q103 q103, Predicate<Q103> pred) {
        String result = pred.test(q103) ? "match" : "not match";
        System.out.println(result);
    }
}
