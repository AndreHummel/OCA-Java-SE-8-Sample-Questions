/**
 * What is the result?
 *
 * A. e, e
 *    i, o
 *
 * B. a, e
 *    i, o
 *
 * C. a, e
 *    o, o
 *
 * D. e, e
 *    o, o
 *
 */

public class Q72 {
    private char var;

    public static void main(String[] args){
        char var1 = 'a';
        char var2 = var1;
        var2 = 'e';

        Q72 obj1 = new Q72();
        Q72 obj2 = obj1;
        obj1.var = 'i';
        obj2.var = 'o';

        System.out.println(var1 + ", " + var2);
        System.out.println(obj1.var + ", " + obj2.var);
    }
}
