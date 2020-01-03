/**
 * What's the result'?
 *
 * A. 12A512A5
 *
 * B. 12A12A
 *
 * C. 1025102A
 *
 * D. An Exception is thrown at runtime
 *
 */

public class Q90 {
    public static void main(String args[]) {
        StringBuilder s = new StringBuilder(10 + 2 + "ABC" + 4 + 5);
        s.append(s.delete(3, 6));
        System.out.println(s);
    }
}

