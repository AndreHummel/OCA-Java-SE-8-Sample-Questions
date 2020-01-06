/**
 * How many String objects have been created when the code reaches line n1?
 */

public class Q114 {
    public static void main(String[] args) {
        String s = "Java";      // 'Java'
        s.concat(" SE 8");      // 'SE 8' and 'Java SE 8'
        s.toLowerCase();        // 'java'
        System.out.print(s);
        //line n1
    }
}
