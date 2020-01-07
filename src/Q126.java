import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * What is the result?
 *
 * A. [1, 2, 3, 4, 5, 6]
 *    [2, 4, 6]
 *
 * B. [1, 2, 3, 4, 5, 6]
 *    [1, 3, 5]
 *
 * C. [1, 2, 3, 4, 5, 6]
 *    [1, 2, 3, 4, 5, 6]
 *
 * D. Compilation fails
 *
 * E. An exception is thrown at runtime
 */

public class Q126 {
    public static void main(String[] args) {
        List<String> l1 = Arrays.asList("1", "2", "3", "4", "5", "6");
        System.out.println(l1);
        List<Integer> l2 = l1.stream().map(s -> Integer.valueOf(s))
                                      .filter(number -> number % 2 == 0)
                                      .collect(Collectors.toList());
        System.out.println(l2);
    }
}
