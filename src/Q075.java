/**
 * Given the code below: What is the result?
 *
 * A. 200.0 : 100.0
 *
 * B. 400.0 : 200.0
 *
 * C. 400.0 : 100.0
 *
 * D. Compilation fails.
 *
 */

class Product{
    double price;

    public void updatePrice(double price){
        price = price * 2;
        this.price = this.price + price;
    }
}

public class Q075 {
    public static void main(String[] agrs){
        Product prt = new Product();
        prt.price = 200;
        double newPrice = 100;

        prt.updatePrice(newPrice);
        System.out.println(prt.price + " : " + newPrice);
    }
}
