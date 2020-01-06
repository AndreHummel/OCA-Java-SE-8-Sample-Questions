/**
 * A. myMethod
 *    finally 1
 *
 * B. myMethod
 *    finally 1
 *    Exception in thread "main" java.lang.StackOverflowError
 *
 * C. myMethod
 *    Exception in thread "main" java.lang.StackOverflowError
 *
 * D. myMethod
 *
 * E. The code fails to compile.
 *
 */

public class Q106 {
    void method() {
        try {
            myMethod();
            return;
        } finally {
            System.out.println("finally 1");
        }
    }

    void myMethod() {
        System.out.println("myMethod");
        throw new StackOverflowError();
    }

    public static void main(String[] args) {
        Q106 var = new Q106();
        var.method();
    }
}
