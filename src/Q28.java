/**
 * What is the result?
 *
 * A. 3 4 5 6
 *
 * B. 3 4 3 6
 *
 * C. 5 4 5 6
 *
 * D. 3 6 4 6
 */

public class Q28 {
    public static void main(String[] args) {
        I x1 = new I();
        I x2 = new I();
        x1.i = 3;
        x1.j = 4;
        x2.i = 5;
        x2.j = 6;
        System.out.println(x1.i + " " + x1.j + " " + x2.i + " " + x2.j);
    }
}

class I {
    static int i;
    int j;
}