/**
 * Select correct options (choose 2)
 *
 * A. Code will compile successfully if code at line n2 is commented
 *
 * B. Code will output the same result if access modifier of main is changed to private at line n1
 *
 * C. Code won't compile if line n2 is placed after line n3
 *
 * D. Code compiles successfully, but an exception is thrown at runtime
 *
 */

public class Q117 {
    protected static void main(){               //line n1
        System.out.print("OCA ");
    }

    public static void main(String[] args){
        main();                                 //line n2
        System.out.println("Java SE 8");        //line n3
    }
}
