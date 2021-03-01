package Java.Introduction;
// https://www.hackerrank.com/challenges/java-date-and-time/problem
import java.util.*;

public class DateAndTime {
    /*
        * Complete the 'findDay' function below.
        *
        * The function is expected to return a STRING.
        * The function accepts following parameters:
        *  1. INTEGER month
        *  2. INTEGER day
        *  3. INTEGER year
        */

    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month-1, day);
        int val = cal.get(Calendar.DAY_OF_WEEK)-1;
        String[] days = {"SUNDAY", "MONDAY", "TUESDAY",
        "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        return(days[val]);
    }
}

/*
That bloody `month-1`! I spent far too long debugging that. Months start at base 0, obvious in hindsight.
*/