/**
 * Which code fragment should you use to instantiate the dvd object successfully?
 */

public class Q013 {
    public static void main(String[] args){
        DVD dvd = new DVD(10,20);
    }
}

class CD{
    int r;
    CD(int r){
        this.r=r;
    }
}

class DVD extends CD{
    int c;
    DVD(int r, int c){

    /** OPTION A */
//    super.r =r;
//    this.c=c;

    /** OPTION B */
//    super(r);
//    this(c);

    /** OPTION C */
//    super(r);
//    this.c=c;

    /** OPTION D */
//    this.c =r;
//    super(c);


    }
}
