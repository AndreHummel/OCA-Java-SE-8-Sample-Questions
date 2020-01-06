/**
 * A. The while loop won't execute; nothing will be printed.
 *
 * B. The while statement will loop forever, printing all numbers, starting from 1.
 *
 * C. The while statement will loop forever, printing all even numbers, starting from 0.
 *
 * D. The while statement will loop forever, printing all even numbers, starting from 2.
 *
 * E. The while statement will loop forever, printing all odd numbers, starting from 1.
 *
 * F. The while statement will loop forever, printing all odd numbers, starting from 3.
 *
 */

public class Q108 {
    public static void main(String args[]) {
        int a = 0;
        while (a == a++) {
            a++;
            System.out.println(a);
        }
    }
}
