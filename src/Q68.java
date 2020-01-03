/**
 * What is the result?
 *
 * A. 1323
 *
 * B. 2313
 *
 * C. 3132
 *
 * D. 3231
 */


public class Q68 {
    public static void main(String[] args){
        int n[][] = {{1,3},{2,3}};
        for(int i = n.length-1; i>=0; i--){
            for (int y : n[i]){
                System.out.print(y);
            }
        }
    }
}
