/**
 * What is the result?
 *
 * A. An exception is thrown at runtime.
 *
 * B. Initialized
 *    Started
 *    Initialized
 *
 * C. Initialized
 *    Started
 *
 * D. Compilation fails.
 *
 */

public class Q069 {
    public static void main(String[] args){
        Caller c = new Caller();
        c.start();
        c.init();
    }

}

class Caller{
    void init(){
        System.out.println("Initialized");
    }

    void start(){
        init();
        System.out.println("Started");
    }
}
