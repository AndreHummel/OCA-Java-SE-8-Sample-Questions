/**
 * You are asked to develop a program for a shopping application, and you are given the following information:
 *        The application must contain the classes Toy, EduToy, and ConsToy. The Toy class is the superclass of the other two classes.
 *
 *        The int caicuiatePrice (Toy t) method calculates the price of a toy.
 *
 *        The void printToy (Toy t) method printsthe details of a toy.
 *
 *
 * Which definition of the Toy class adds a valid layer of abstraction to the class hierarchy?
 *
 */

public class Q58 {
}

/** OPTION A */
//abstract class Toy{
//    public abstract int calculatePrice(Toy t);
//    public void printToy(Toy t){
//        //code goes here
//    }
//}

/** OPTION B */
//abstract class Toy{
//    public int calculatePrice(Toy t);
//    public void printToy(Toy t);
//}

/** OPTION C */
//abstract class Toy{
//    public int calculatePrice(Toy t);
//    public final void printToy(Toy t){
//        //code goes here
//    };
//}

/** OPTION D */
//abstract class Toy{
//    public abstract int calculatePrice(Toy t){
//        //code goes here
//    }
//    public abstract void printToy(Toy t){
//        //code goes here
//    }
//}