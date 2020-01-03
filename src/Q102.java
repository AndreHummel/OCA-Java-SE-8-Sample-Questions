import java.util.ArrayList;
import java.util.List;

/**
 * Which of the following lambda expressions are valid? (Choose all that apply)
 */

public class Q102 {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();

        /** OPTION A */
//        list.removeIf(s -> s.isEmpty());

        /** OPTION B */
//        list.removeIf(s -> {s.isEmpty()});

        /** OPTION C */
//        list.removeIf(s -> {s.isEmpty();};

        /** OPTION D */
//        list.removeIf(s -> {return s.isEmpty();});

        /** OPTION E */
//        list.removeIf(String s -> s.isEmpty());

        /** OPTION F */
//        list.removeIf((String s) -> s.isEmpty());
    }
}
