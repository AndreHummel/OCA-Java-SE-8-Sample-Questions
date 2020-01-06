/**
 * What's the result:
 *
 * A. 10
 *
 * B. 12
 *
 * C. 13
 *
 * D. 17
 *
 * E. The code will not compile because of line n1.
 *
 * F. The code will not compile because of line n2.
 */

public class Q104 {
    public static void main(String[] args) {
        int x = 5, j = 0;
        for (int i = 0; i < 3;) {                       //line n1
//            System.out.println("for x:"+x);
//            System.out.println("for j:"+j);
//            System.out.println("for i:"+i);
            INNER: do {
//                System.out.println("while x:"+x);
//                System.out.println("while j:"+j);
//                System.out.println("while i:"+i);

                i++; x++;                               //line n2
                if (x > 10)
                    break INNER;
                x += 4;
                j++;
            } while (j <= 2);
        }
        System.out.println(x);
    }
}
