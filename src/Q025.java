/**
 * Which two modifications, when made independently, enable the code to print joe:true: 100.0?
 *
 * A. Replace line n1 with:
 *  e.name = "Joe"
 *  e.contract = true;
 *  e.salary = 100;
 *
 * B. Replace line n1 with:
 *  this.name = "Joe"
 *  this.contract = true;
 *  this.salary = 100;
 *
 * C. Replace line n2 with:
 *  this.name = new String("Joe");
 *  this.contract = new Boolean(true);
 *  this.salary = new Double(100);
 *
 * D. Replace line n2 with:
 *  name = "Joe";
 *  contract = TRUE;
 *  salary = 100.0f;
 *
 * E. Replace line n2 with:
 *  this("Joe", true, 100);
 *
 */

public class Q25 {
    public static void main(String[] args) {
        Employee e = new Employee();
        //line n1
        System.out.print(e);
    }
}

class Employee{
    String name;
    boolean contract;
    double salary;

    Employee(){
        //line n2
    }

    public String toString(){
        return name + ":" + contract + ":" + salary;
    }
}