/**
 *
 * What is the result?
 *
 * A. Writing...
 *
 * B. Writing book
 *
 * C. Writing code
 *
 * D. Compilation fails
 */

public class Q120 {
    public static void main(String[] args) {
        Writer w = new Programmer();
        w.write();
    }
}

abstract class Writer {
    public static void write() {
        System.out.println("Writing...");
    }
}

class Author extends Writer {
    public static void write() {
        System.out.println("Writing book");
    }
}

class Programmer extends Writer {
    public static void write() {
        System.out.println("Writing code");
    }
}
