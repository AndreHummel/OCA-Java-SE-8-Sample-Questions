import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * What's the result? (Choose all that apply)
 *
 * A. 0 1 -2
 *
 * B. 0 1 -3
 *
 * C. 2 1 -2
 *
 * D. 2 1 -3
 *
 * E. None of the above.
 *
 * F. The code doesn't compile.
 */

public class Q100 {
    public static void main(String[] args){
        List<String> hex = Arrays.asList("30", "8", "3A", "FF");
        Collections.sort(hex);
        int x = Collections.binarySearch(hex, "8");
        int y = Collections.binarySearch(hex, "3A");
        int z = Collections.binarySearch(hex,"4F");
        System.out.println(x + " " + y + " " + z);
    }
}
