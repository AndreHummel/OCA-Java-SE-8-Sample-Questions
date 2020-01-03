/**
 * What's the result'?
 *
 * A. 10
 *
 * B. 30
 *
 * C. 31
 *
 * D. 32
 *
 */

public class Q91 {
    public static void main(String[] args) {
        int i = 10;
        do
            while (i < 15)
                i = i + 20;
        while (i < 2);
        System.out.println(i);
    }
}
