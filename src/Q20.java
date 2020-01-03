/**
 * Which modification enables the code to print 54321?
 *
 * A. Replace line n1 with System.out.print(--x) ;
 *
 * B. At linen2, insert x--;
 *
 * C. Replace line n1 with --x; and, at line n2, insert system.out.print(x);
 *
 * D. Replace line n3 With return (x > 0) ? false: true;
 *
 */

public class Q20 {
    public static void main(String[] args){
        int x = 5;
        while (isAvailable(x)){
            System.out.print(x);                // line n1
        }                                       // line n2
    }

    public static boolean isAvailable(int x){
        return x-- > 0 ? true : false;          // line n3
    }
}
