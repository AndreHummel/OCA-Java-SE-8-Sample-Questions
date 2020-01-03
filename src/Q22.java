/**
 * What is the result?
 *
 * A. 5 4 3 21 0
 *
 * B. 5 4 3 2 1
 *
 * C. 4 2 1
 *
 * D. 5
 *
 * E. Nothing is printed
 */

public class Q22 {
    public static void main(String[] args){
        int num = 5;
        do {
            System.out.println(num-- + " ");
        } while (num == 0);
    }
}
