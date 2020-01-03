/**
 * Which lamba can replace the MySecret class to return the same value? (Choose all that apply)
 */

public class Q101 {
    public static void main(String[] args){
        Secret secret = new MySecret();
        System.out.println(secret.magic(1.0));

        /** OPTION A */
//        print((s) -> "Poof");

        /** OPTION B */
//        print((s) -> {"Poof"});

        /** OPTION C */
//        print((s) -> {String s = ""; return "Poof";});

        /** OPTION D */
//        print((s) -> {String s = ""; return "Poof";});

        /** OPTION E */
//        print((s) -> {String s = ""; return "Poof"});

        /** OPTION F */
        print((s) -> {String t = ""; return "Poof";});
    }

    private static void print(Secret s){
        System.out.println(s.magic(1.0));
    }
}

interface Secret {
    String magic(double d);
}

class MySecret implements Secret {
    @Override
    public String magic(double d) {
        return "Poof";
    }


}
