/**
 * What's the result?
 *
 * A. Line 6 generates a compiler error.
 *
 * B. Line 7 generates a compiler error.
 *
 * C. There is no output.
 *
 * D. Empty = false,
 *    Brand = null
 *
 * E. Empty = false,
 *    Brand =
 *
 * F. Empty = null,
 *    Brand = null
 */

public class Q79 {
    private String brand;
    private boolean empty;

    public static void main(String[] args) {
        Q79 obj = new Q79();
        System.out.println("Empty = " + obj.empty);
        System.out.println(", Brand = " + obj.brand);
    }
}
