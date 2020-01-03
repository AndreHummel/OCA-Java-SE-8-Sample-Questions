import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Assume that the system date is June 20, 2020. What is the result?
 *
 * A. date1 = 2020-06-20
 *    date2 = 2020-06-20
 *    date3 = 2020-06-20
 *
 * B. date1 = 06/20/2020
 *    date2 = 2020-06-20
 *    date3 = Jun 20, 2020
 *
 * C. Compilation fails
 *
 * D. A DateParseException is thrown at runtime
 *
 */

public class Q35 {
    public static void main(String[] args){
        LocalDate date1 = LocalDate.now(); //imagine LocalDate.now() returns June 20, 2020 as system time
        LocalDate date2 = LocalDate.of(2020,6,20);
        LocalDate date3 = LocalDate.parse("2020-06-20", DateTimeFormatter.ISO_DATE);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
        System.out.println("date3 = " + date3);
    }
}
