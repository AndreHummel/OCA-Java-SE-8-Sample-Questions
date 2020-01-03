/**
 * What is the result?
 *
 * A. true:true
 *
 * B. true:false
 *
 * C. false:true
 *
 * D. false:false
 */

public class Q065 {
    int id;
    String name;

    public Q065(int id, String name){
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args){
        Q065 obj1 = new Q065(101, "Pen");
        Q065 obj2 = new Q065(101, "Pen");
        Q065 obj3 = obj1;
        boolean ans1 = obj1==obj2;
        boolean ans2 = obj1.name.equals(obj2.name);
        System.out.println(ans1 + ":" + ans2);
    }
}
