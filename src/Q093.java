/**
 * What's the result'?
 *
 * A. javZ2sAa
 *
 * B. jZvZ
 *
 * C. jZv
 *
 * D. jZvZ2s
 *
 * E. java2s
 */

public class Q093 {
    public static void main(String args[]) {
        String s = "java2s".replace('a', 'Z').trim().concat("Aa");
        s.substring(0, 2);
        System.out.println(s);
    }
}
