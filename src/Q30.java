/**
 * What is the result?
 *
 * A. A B C Work done
 *
 * B. A B C D Work done
 *
 * C. A Work done
 *
 * D. Compilation fails
 */


public class Q30 {
    public static void main(String[] args){
        String[] arr = {"A", "B", "C", "D"};
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
            if (arr[i].equals("C")){
                continue;
            }
            System.out.println("Work done");
            break;
        }
    }
}
