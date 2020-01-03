/**
 * Which code fragment enables the class to print Equal?
 */

public class Q048 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String("java");

        /** OPTION A */
//        String str3 = str2;
//        if (str1 == str3)

        /** OPTION B */
//        if (str1.equalsIgnoreCase(str2))

        /** OPTION C */
//        String str3 = str2;
//        if (str1.equals(str2))

        /** OPTION D */
//        if (str1.toLowerCase() == str2.toLowerCase())

        {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

    }
}
