import java.util.ArrayList;

/**
 * What's the result? (Choose all that apply)
 *
 * A. 4
 *
 * B. 5
 *
 * C. 6
 *
 * D. 46
 *
 * E. 45
 *
 * F. An exception is thrown
 *
 * G. The code does not compile
 */

public class Q099 {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();
        values.add(4);
        values.add(5);
        values.set(1, 6);
        values.remove(0);
        for (Integer v : values) System.out.println(v);
    }
}
