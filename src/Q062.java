/**
 * What is the result?
 *
 * A. myStr: 9009, myNum: 9009
 *
 * B. myStr: 7007, myNum: 7007
 *
 * C. myStr: 7007, myNum: 9009
 *
 * D. Compilation fails
 *
 */

public class Q062 {
    String myStr = "7007";

    public void doStuff(String str){
        int myNum = 0;
        try{
            String myStr = str;
            myNum = Integer.parseInt(myStr);
        } catch (NumberFormatException ne){
            System.err.println("Error");
        }
        System.out.println("myStr: " +  myStr + ", myNum: " + myNum);
    }

    public static void main(String[] args){
        Q062 obj = new Q062();
        obj.doStuff("9009");
    }
}
