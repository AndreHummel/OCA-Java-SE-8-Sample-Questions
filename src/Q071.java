/**
 * What is the result?
 *
 * A. 100 0 : 100 200:
 *
 * B. 100 0 : 100 0 :
 *
 * C. 100 200 : 100 200 :
 *
 * D. 100 200 : 100 0 :
 *
 */

public class Q071 {
    int x;
    int y;

    public void doStuff(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void display(){
        System.out.print(x + " " + y + " : ");
    }

    public static void main(String[] args){
        Q071 obj1 = new Q071();
        obj1.x = 100;
        obj1.y = 200;
        Q071 obj2 = new Q071();
        obj2.doStuff(obj1.x, obj1.y);
        obj1.display();
        obj2.display();
    }
}
