/**
 * Which options are true of the following code? (Choose all that apply)
 *
 * A. Immediately after line n1, no Q105 objects are eligible for garbage collection.
 *
 * B. Immediately after line n2, no Q105 objects are eligible for garbage collection.
 *
 * C. Immediately after line n1, only one Q105 object is eligible for garbage collection.
 *
 * D. Immediately after line n2, only one Q105 object is eligible for garbage collection.
 *
 * E. Immediately after line n3, only one Q105 object is eligible for garbage collection.
 *
 * F. The code compiles.
 *
 * G. The code does not compile.
 *
 */

public class Q105 {
    public Q105(String n) {
        name = n;
    }

    public static void main(String[] args) {
        Q105 one = new Q105("g1");
        Q105 two = new Q105("g2");
        one = two;                              //line n1
        two = null;                             //line n2
        one = null;                             //line n3
    }

    private String name;
}

//At line1 Object g1 is eligible for garbage collection since both one and two point to Object g2.
//line n2 //At line2 Object g1 is still eligible for garbage collection. Reference one points to g1 and reference two is null.
//line n3 //At line3 Both Object objects are eligible for garbage collection since both one and two point to null.
