/**
 *
 * What is the result?
 *
 * A. E1
 *
 * B. E2
 *
 * C. 5 10 E1
 *
 * D. Compilation fails
 */

public class Q122 {
    public static void main(String[] args) {
        int x = 10;
        int y = 2;
        try {
            for (int z = 2; z >= 0; z--) {
                int ans = x / z;
                System.out.print(ans+ " ");
            }
        } catch (Exception e1) {
            System.out.println("E1");
        } catch (ArithmeticException e1) {
            System.out.println("E2");
        }
    }
}
