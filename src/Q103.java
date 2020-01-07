import java.util.function.Predicate;

/**
 * What's the result:
 *
 * A. match
 *
 * B. not match
 *
 * C. Compiler error on line n1
 *
 * D. Compiler error on line n2.
 *
 * E. Compiler error on line n3.
 *
 * F. A runtime exception is thrown.
 */

public class Q103 {
    int x;

    public static void main(String[] args) {
        Q103 p1 = new Q103();
        p1.x = 1;
        check(p1, p -> p.x < 5);                                    //line n1
    }

    private static void check(Q103 q103, Predicate<Q103> pred) {    //line n2
        String result = pred.test(q103) ? "match" : "not match";    //line n3
        System.out.println(result);
    }
}
