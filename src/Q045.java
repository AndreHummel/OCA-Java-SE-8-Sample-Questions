import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Which code fragment enables the code to print Hank?
 */

public class Q045 {
    public static void checkAge(List<Person> list, Predicate<Person> predicate) {
        for (Person p : list) {
            if (predicate.test(p)) {
                System.out.println(p.name + " ");
            }
        }
    }

    public static void main(String[] args) {
        List<Person> iList = Arrays.asList(new Person("Hank", 45),
                                           new Person("Charlie", 40),
                                           new Person("Smith", 38));

        /** OPTION A */
//        checkAge (iList, () -> p.getAge() > 40);

        /** OPTION B */
//      checkAge(iList, Person p -> p.getAge() > 40);

        /** OPTION C */
//       checkAge (iList, p -> p.getAge () > 40);

        /** OPTION D */
//      checkAge(iList, (Person p) -> { p.getAge() > 40; });
    }
}

class Person {
    String name;
    int age;

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
