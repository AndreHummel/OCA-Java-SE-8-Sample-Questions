import java.util.ArrayList;

/**
 * What is the result?
 *
 * A. Execution terminates in the first catch statement, and caught a RuntimeException is printed to the console.
 *
 * B. Execution terminates in the second catch statement, and caught an Exception is printed to the console.
 *
 * C. A runtimeerror is thrown in the thread "main".
 *
 * D. Execution completes normally, and Ready to use is printed to the console.
 *
 * E. Execution never terminates.
 *
 */

public class Q43 {
    public static void main(String[] args){
        ArrayList myList = new ArrayList();
        String[] myArray;
        try{
            while(true){
                myList.add("My String");
            }
        }
        catch (RuntimeException re){
            System.out.println("Caught a RuntimeException");
        }
        catch (Exception e){
            System.out.println("Caught an Exception");
        }
        System.out.println("Ready to use");
    }
}
