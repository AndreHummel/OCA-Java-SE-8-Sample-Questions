/**
 * What's the output of the following code?
 *
 * A. true printed once
 *
 * B. false printed once
 *
 * C. true printed in an infinite loop
 *
 * D. false printed in an infinite loop
 */

public class Q087 {
    public static void main(String args[]) {
        String s1 = new String("Java");
        String s2 = new String("Java");
        String s3 = "Java";
        String s4 = "Java";
        do
            System.out.println(s1.equals(s2));
        while (s3 == s4);
    }
}
