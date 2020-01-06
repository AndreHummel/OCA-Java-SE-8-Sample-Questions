/**
 * What's the result?
 *
 * A. 20
 *
 * B. 22
 *
 * C. 24
 *
 * D. An exception is thrown at runtime
 *
 * E. Compilation fails
 */

public class Q113 {
    public static void main(String[] args) {
        int x = 10;
        int y = new Q113().change(x);
        System.out.println(x + y);
    }

    int change(int x) {
        x = 12;
        return x;
    }
}
