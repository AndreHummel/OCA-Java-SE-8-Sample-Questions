import java.io.IOException;

/**
 * Which two modifications should you make so that the code compiles successfully?
 *
 * .A. Replace line n1 with public static void main(String[] args) throws Exception {
 *
 * B. Replace line n2 with:
 *      try {
 *          xobj.printFileContent();
 *      }
 *      catch(Exception e){}
 *      catch(IOException e{}
 *
 * .C. Replace line n4 with public void printFileContent() throws IOException {
 *
 * D. Replace line n5 with throw IOException("Exception raised");
 *
 * E. At line n3 insert throw new IOException();
 *
 */

public class Q008 {
    public static void main(String[] args){ // line n1
        X xobj = new X();
        xobj.printFileContent();            // line n2
    }                                       // line n3
}

class X{
    public void printFileContent(){         // line n4
        /* code goes here */
        throw new IOException();            // line n5
    }
}
