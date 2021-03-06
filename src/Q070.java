/**
 * What is the result?
 *
 * A. Answer = 0
 *
 * B. Invalid calculation
 *
 * C. Compilation fails only at line n1.
 *
 * D. Compilation fails only at line n2.
 *
 * E. Compilation fails both at line n1 and line n2.
 *
 */


public class Q070 {
    public static void main(String[] args){
        try{
            int num = 10;
            int div = 0;
            int ans = num/div;
        } catch (ArithmeticException ae){
            ans = 0;                                    //line n1
        } catch (Exception e){
            System.out.println("Invalid calculation");
        }
        System.out.println("Answer = " + ans);          //line n2
    }
}
