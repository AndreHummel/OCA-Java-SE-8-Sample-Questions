/**
 * What's the result'?
 *
 * A. javZ2sAa
 *
 * B. jZvZ2sAa
 *
 * C. jZv
 *
 * D. jZvZ2s
 *
 * E. java2s
 */

public class Q88 {
    public static void main(String args[]) {
        String s = "java2s";
        s.replace('a', 'Z').trim().concat("Aa");
        s.substring(0, 2);
        System.out.println(s);
    }
}
