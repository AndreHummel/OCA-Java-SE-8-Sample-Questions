
/**
 * Which set of commands prints Hello Duke in the console?
 *
 * A. javac Greeting
 *    java Greeting Duke
 *
 * B. javac Greeting.java Duke
 *    java Greeting
 *
 * C. javac Greeting.java
 *    java Greeting Duke
 *
 * D. javac Greeting.java
 *    java Greeting.class Duke
 *
 */

public class Q32 {
    public static void main(String[] args){
        System.out.println("Hello " + args[0]);
    }
}
