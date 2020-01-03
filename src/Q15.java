/**
 * How many MarkList instances are created in memory at runtime?
 *
 * A. 1
 *
 * B. 2
 *
 * C. 3
 *
 * D. 4
 */

public class Q15 {

//    private static int counter;                       //Answer check

//    public Q15(){                                     //Answer check
//        counter++;
//    }

//    public static int getNumOfInstences(){            //Answer check
//        return counter;
//    }

    int num;

    public static void graceMarks(Q15 obj4) {
        obj4.num += 10;
    }

    public static void main(String[] args) {
        Q15 obj1 = new Q15();
        Q15 obj2 = obj1;
        Q15 obj3 = null;
        obj2.num = 60;
        graceMarks(obj2);

//        System.out.println(getNumOfInstences());      //Answer check

    }
}

