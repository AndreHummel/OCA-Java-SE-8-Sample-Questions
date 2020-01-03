/**
 * What is the result?
 *
 * A. A B B
 *
 * B. A B C D E
 *
 * C. A B D E
 *
 * D. Compilation fails
 *
 */

public class Q046 {
    public static void main(String[] args){
        String[][] arr = {{"A", "B", "C"}, {"D", "E"}};
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] + " ");
                if(arr[i][j].equals("B")){
                    break;
                }
            }
            continue;
        }
    }
}
