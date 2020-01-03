/**
 * Which modification enables the code to print TrueDone?
 *
 * A. Replace line n1 with String opt= "true";
 *    Replace line n2 with case "true":
 *
 * B. Replace line n1 with boolean opt = l;
 *    Replace line n2 with case 1=
 *
 * C. At line n3, remove the break statement.
 *
 * D. Remove the default section.
 *
 */

public class Q21 {
    public static void main(String[] args){
        boolean opt = true;                   //line n1
        switch (opt) {                        //line n2
            case true:
                System.out.print("True");
                break;                        //line n3
            default:
                System.out.print("***");
        }
        System.out.print("Done");
    }
}
