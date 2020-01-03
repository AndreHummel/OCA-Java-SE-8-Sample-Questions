package Q004.p3;

//line n2

/**
 * Which modification enables the code to compile?
 *
 *
 * A. Replace line n1 with:
 *      import p1.A;
 *
 *    Replace line n2 with:
 *      import p1.A;
 *      import p1.p2.B;
 *
 * B. Replace line n1 with:
 *      import p1;
 *
 *    Replace line n2 with:
 *      import p1;
 *      import p1.p2;
 *
 * C. Replace line n1 with:
 *      import p1.A;
 *
 *    Replace line n2 with:
 *      import p1.*;
 *
 * D. Replace line n1 with:
 *      import p1.*;
 *
 *    Replace line n2 with:
 *      import p1.p2.*;
 */

public class Q004
{
    public static void main(String[] args){
        A o1 = new A();
        B o2 = new B();
    }
}
