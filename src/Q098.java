/**
 * What's the result? (Choose all that apply)
 *
 * A. 01+89-
 *
 * B. 012+9-
 *
 * C. 012+-9
 *
 * D. 0123456789
 *
 * E. An exception is thrown.
 *
 * F. The code does not compile.
 *
 */

public class Q098 {
    public static void main(String[] args){
        StringBuilder numbers = new StringBuilder("0123456789");
        numbers.delete(2, 8);
        numbers.append("-").insert(2, "+");
        System.out.println(numbers);
    }
}
