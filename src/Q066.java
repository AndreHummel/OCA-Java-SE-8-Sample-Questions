/**
 * Which two options fail to compile when inserted?
 */

public class Q066 {
    public static void main(String[] args){
        Employer employer = new Employer();
        Manager manager = new Manager();
        Director director = new Director();

        /** OPTION A */
//        employer.salary = 50_000;

        /** OPTION B */
//        director.salary = 80_000;

        /** OPTION C */
//        employer.budget = 200_000;

        /** OPTION D */
//        manager.budget = 1_000_000;

        /** OPTION E */
//        manager.stockOption = 500;

        /** OPTION F */
//        director.stockOptions = 1_000;
    }
}

class Employer{
    public int salary;
}

class Manager extends Employer{
    public int budget;
}

class Director extends Manager{
    public int stockOptions;
}
