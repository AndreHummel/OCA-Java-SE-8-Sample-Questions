/**
 *  A. 4 1
 *
 *  B. 41
 *
 *  C. 5
 *
 *  D. 5 tuna
 *
 *  E. 5tuna
 *
 *  F. 15tuna
 *
 *  G. The code does not compile.
 */

public class Q095 {
    public static void main(String[] args) {
        int numFish = 4;
        String fishType = "tuna";
        String anotherFish = numFish + 1;
        System.out.print(anotherFish + " " + fishType);
        System.out.print(numFish + " " + 1);
    }
}
}
