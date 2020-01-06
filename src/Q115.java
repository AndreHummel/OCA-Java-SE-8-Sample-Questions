/**
 * What's the result when the class is executed using the following command?
 *
 *      java Q115 1 11 EJava Guru
 *
 * A. 1
 *
 * B. 1 11
 *
 * C. 111
 *
 * D. 12
 *
 * E. 1 11 EJava Guru
 *
 * F. Compilation fails
 *
 * G. Runtime error
 */

public class Q115 {
    public static void main(String... args){
        System.out.println(args[0] + args[1]);
    }
}
