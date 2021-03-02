package Java.Strings;
// https://www.hackerrank.com/challenges/java-strings-introduction/problem
import java.util.*;

public class StringsIntroduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        Integer len = A.length() + B.length();
        boolean BigA = (A.compareTo(B) > 0) ? true : false;
        String UpperAdded = (
            A.substring(0, 1).toUpperCase() + 
            A.substring(1) + 
            " " + 
            B.substring(0, 1).toUpperCase() + 
            B.substring(1)
        );
        System.out.println(len.toString());
        if (BigA) System.out.println("Yes");
        else System.out.println("No");
        System.out.println(UpperAdded);
        
    }
}
