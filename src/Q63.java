/**
 * What is the result?
 *
 * A. 1000 500
 *
 * B. 500 500
 *
 * C. 1000 1000
 *
 * D. Compilation fails.
 *
 */

public class Q63 {
    public static void main(String[] args){
        int var = 500;
        System.out.print(doCalc(var));
        System.out.println(" " + var);
    }
    static int doCalc(int var){
        var = var*2;
        return var;
    }
}
