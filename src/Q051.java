/**
 * What is the result?
 *
 * A. 10:20
 *
 * B. 0:20
 *
 * C. Compilation fails at line n1
 *
 * D. Compilation failsat line n2
 *
 */

public class Q051 {
    public static void main(String[] args){
        Animal y = new Dog();
        System.out.println(y);
    }
}

class Animal{
    int x;

    Animal(){
        this(10);                   // line n1
    }

    Animal(int x) {
        this.x = x;
    }
}

class Dog extends Animal{
    int y;
    Dog(){
        super();
        this(20);                   // line n2
    }

    Dog(int y){
        this.y = y;
    }

    public String toString(){
        return super.x + ":" + this.y;
    }
}