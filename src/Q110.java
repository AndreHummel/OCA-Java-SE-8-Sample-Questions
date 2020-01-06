/**
 * What's the result?
 *
 * A. The code will print Java.
 *
 * B. The code will print Oracle.
 *
 * C. The code will not compile.
 *
 * D. The code will throw an exception or an error at runtime.
 */

public class Q110 {
    public static void main(String args[]) {
        Course c = new Course();
        c.courseName = "Java";
        System.out.println(c.courseName);
    }
}

class Course {
    String courseName;

    Course() {
        Course c = new Course();
        c.courseName = "Oracle";
    }
}