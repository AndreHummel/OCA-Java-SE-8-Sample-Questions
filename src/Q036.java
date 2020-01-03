/**
 * Which code fragment enables the code to print true?
 */

public class Q036 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Duke");
        String str1 = sb1.toString();

        /** OPTION A */
//        String str2 = str1;

        /** OPTION B */
//        String str2 = new String (str1);

        /** OPTION C */
//          String str2 = sb1. toString ();

        /** OPTION D */
//          String str2 = "Duke";


        System.out.println(str1 == str2);
    }
}
