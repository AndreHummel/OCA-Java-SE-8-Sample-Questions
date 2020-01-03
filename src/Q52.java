/**
 * What is the result?
 *
 * A. Hello Java SE 8
 *    Hello Java SE 8
 *
 * B. Hello java.lang.StringBuilder@<<hashcode1>>
 *    Hello MyString@<<hashcode2>>
 *
 * C. Hello Java SE 8
 *    Hello MyString@<<hashcode>>
 *
 * D. Compilation fails at the Q52 class
 *
 */

public class Q52 {
    public static void main(String[] args){
        System.out.println("Hello " + new StringBuilder("Java SE 8"));
        System.out.println("Hello " + new MyString("Java SE 8"));
    }
}

class MyString{
    String msg;
    MyString(String msg){
        this.msg = msg;
    }
}
