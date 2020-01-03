/**
 * What's the result'?
 *
 * A. Shape
 *
 * B. Rectangle
 *
 * C. Square
 *
 * D. Compilation fails
 */

public class Q89 {
    public static void main(String[] args) {
        Shape f1 = new Rectangle();
        Shape f2 = new Square();
        f1.fragrance();
}

class Shape {
    public void fragrance() {
        System.out.println("Shape");
    }
}

class Rectangle {
    public void fragrance() {
        System.out.println("Rectangle");
    }
}

class Square {
    public void fragrance() {
        System.out.println("Square");
    }
}

