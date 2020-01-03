/**
 * Which option enables the code to compile?
 *
 * A. Replace the code fragment at line n1 with class Book implememts Readable {
 *
 * B. At line n2 insert: public abstract void setBookMark();
 *
 * .C. Replace the code fragment at line n3 with: abstract class EBook extends Book {
 *
 * D. At line n4 insert: public void setBookMark(){}
 *
 */

public class Q011 {
}

interface Readable{
    public void ReadBook();
    public void SetBookMark();
}

abstract class Book implements Readable{    //line n1
    @Override
    public void ReadBook() {}
                                            //line n2
}

class EBook extends Book{                   //line n3
    @Override
    public void ReadBook() {}
                                            //line n4
}
