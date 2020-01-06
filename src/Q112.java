/**
 * What's the result?
 *
 * A. 1 Dog 7
 *    1 Dog 7
 *
 * B. 1 Dog 7
 *    1 Dog 5
 *
 * C. 1 Dog 5
 *    1 Dog 5
 *
 * D. ClassCastException is thrown at runtime
 *
 * E. Compilation fails
 */

public class Q112 {
    public static void main(String[] args) {
        Pet p1 = new Pet("Dog", 5);
        Q112 test = new Q112();
        Pet p2 = test.change(p1);
        System.out.println(p2.pid + " " + p2.name + " " + p2.age);
        System.out.print(p1.pid + " " + p1.name + " " + p1.age);
    }

    private Pet change(Object o) {
        Pet p2 = (Pet) o;
        p2.age = 7;
        return p2;
    }
}

class Pet {
    Pet(String s, int i) {
        ++pid;
        name = s;
        age = i;
    }

    static int pid;
    int age;
    String name;
}