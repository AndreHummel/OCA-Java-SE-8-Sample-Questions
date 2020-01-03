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

public class Q072 {
    private char var;

    public static void main(String[] args){
        char var1 = 'a';
        char var2 = var1;
        var2 = 'e';

        Q072 obj1 = new Q072();
        Q072 obj2 = obj1;
        obj1.var = 'i';
        obj2.var = 'o';

        System.out.println(var1 + ", " + var2);
        System.out.println(obj1.var + ", " + obj2.var);
    }
}
