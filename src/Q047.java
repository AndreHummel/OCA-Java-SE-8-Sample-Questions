/**
 * What is the result?
 *
 * A. true true
 *
 * B. true false
 *
 * C. false false
 *
 * D. false true
 */

public class Q047 {
    public static void main(String[] args){
        String str = " ";
        str.trim();
        System.out.println(str.equals("") + " " + str.isEmpty());
    }
}
