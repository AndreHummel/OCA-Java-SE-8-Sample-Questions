/**
 * What is the result?
 *
 * A. trees
 *    Ash tree
 *    100
 *
 * B. [LTree@<<hascode>>
 *    Ash tree
 *    100
 *
 * C. [LTree@<<hascode1>>
 *    Tree@<<hascode2>>
 *    100
 *
 * D. [LTree@<<hascode1>>
 *    Tree@<<hascode2>>
 *    [LTree.Leaves@<<hascode3>>
 *
 *
 * D. [LTree@<<hascode>>
 *    Oak
 *    0
 */

public class Q57 {
    public static void main(String[] args){
        Tree[] trees = { new Tree("Birk", 0),
                         new Tree("Oak", 0),
                         new Tree("Ash tree", 100),
                         new Tree("Beeach", 200)
        };

        System.out.println(trees);
        System.out.println(trees[2]);
        System.out.println(trees[2].leaves);
    }
}

class Tree{
    public String name;
    public int leaves;

    public Tree(String name, int leaves){
        this.name = name;
        this.leaves = leaves;
    }
}
