/**
 * What's the result?
 *
 * A. If  the  class  Main  is  executed  using  the  following  command,  it prints NullPointerException:
 *
 * B. If  the  class  Main  is  executed  using  the  following  command,  it prints IndexOutOfBoundsException:
 *
 * C. If  the  class  Main  is  executed  using  the  following  command,  it prints ArrayIndexOutOfBoundsException:
 *
 * D. The code will fail to compile.
 *
 */

public class Q109 {
    public static void main(String args[]) {
        Q109 var = new Q109();
        var.print(args);
    }
    void print(String[] arr) {
        try {
            System.out.println(arr[0] + ":" + arr[1]);
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
}
