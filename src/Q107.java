/**
 * What's the result:
 *
 * A. 10
 *
 * B. 11
 *
 * C. 12
 *
 * D. Compilation error.
 *
 * E. Runtime exception.
 */

public class Q107 {
    int tryAgain() {
        int a = 10;
        try {
            ++a;
        }
        finally {
            a++;
        }
        return a;
    }
    public static void main(String args[]) {
        System.out.println(new Q107().tryAgain());
    }
}
