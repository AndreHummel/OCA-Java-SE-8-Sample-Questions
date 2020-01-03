/**
 * Which code fragment prints red: blue: small: medium?
*/

public class Q18 {
    public static void main(String[] args) {
        String[][] shirts = new String[2][2];
        shirts[0][0] = "red";
        shirts[0][1] = "blue";
        shirts[1][0] = "small";
        shirts[1][1] = "medium";

/** OPTION A */
//        for (int index=1; index<2; index++){
//            for (int idx=1; idx<2; idx++){
//                System.out.print(shirts[index][idx] + ":");
//            }
//        }

/** OPTION B */
//        for (int index=1; index<2; ++index){
//            for (int idx=1; idx<index; ++idx){
//                System.out.print(shirts[index][idx] + ":");
//            }
//        }

/** OPTION C */
//        for (String s : colors){
//            for (String s : sizes){
//                System.out.println(s + ":");
//            }
//        }

/** OPTION D */
//        for (int index=0; index<2;){
//            for (int idx=0; idx<2;){
//                System.out.print(shirts[index][idx] + ":");
//                idx++;
//            }
//            index++;
//        }
    }
}
