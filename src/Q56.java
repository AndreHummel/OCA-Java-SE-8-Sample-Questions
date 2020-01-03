/**
 * A. Jesse 25
 *    Walter 52
 *
 * B. Compilation fails only at line n1
 *
 * C. Compilation fails only at line n2
 *
 * D. Compilation fails at both line n1 and line n2
 */

public class Q56 {
    public static void main(String[] args){
        Man m1 = new Man("Jesse");
        Man m2 = new Man("Walter", 52);
        System.out.println(m1.show());
        System.out.println(m2.show());
    }
}

class Man{
    String name;
    int age = 25;

    Man(String name){
        this();       // line n1
        setName(name);
    }

    Man(String name, int age){
        Man(name);    // line n2
        setAge(age);
    }

    private void setName(String name){
        this.name = name;
    }

    private void setAge(int age){
        this.age = age;
    }

    String show(){
        return name + " " + age;
    }
}
