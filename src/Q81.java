/**
 * What's the result?
 *
 * A. 1 will be printed out
 *
 * B. 2 will be printed out
 *
 * C. A compile time error will be generated
 *
 * D. An exception will be thrown
 */

public class Q81 {
    private int i = 1;
    public static void main(String argv[]){
        int i = 2;
        Q81 s = new Q81 ();
        s.someMethod();
    }
    public static void someMethod(){
        System.out.println(i);
    }
}
