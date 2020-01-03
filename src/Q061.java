/**
 * What is the result?
 *
 * A. A
 *
 * B. B
 *
 * C. Either A or B
 *
 * D. AB
 *
 * E. A compile time error occurs at line n1
 */

public class Q061 {
    public static void main(String[] args){
        try{
            method();
        }
        catch (MyException me){
            System.out.println("A");
        }
    }

    public static void method(){ // line n1
        try{
            throw Math.random() > 0.5 ? new MyException() : new RuntimeException();
        }
        catch (RuntimeException re){
            System.out.println("B");
        }
    }
}

class MyException extends RuntimeException{}
