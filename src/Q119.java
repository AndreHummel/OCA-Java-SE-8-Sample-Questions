import java.util.ArrayList;
import java.util.List;

/**
 *
 * What is the result?
 *
 * A. null
 *
 * B. 10
 *
 * C. 0
 *
 * D. An IndexOutOfBoundsException is thrown at runtime
 */

public class Q119 {
    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>();
        elements.add(10);
        int firstElmnt = elements.get(1);
        System.out.println(firstElmnt);
    }
}

