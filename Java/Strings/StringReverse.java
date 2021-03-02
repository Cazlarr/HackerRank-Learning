package Java.Strings;
// https://www.hackerrank.com/challenges/java-string-reverse/problem
import java.util.*;

public class StringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean palim = true;
        int sLen = A.length();
        for (int i=0; i<(sLen/2); i++) {
            String front = A.substring(i, i+1);
            String back = A.substring(sLen-i-1, sLen-i);
            if (front.compareTo(back) != 0) {
                palim = false;
                break;
            }
        }
        System.out.println(palim ? "Yes" : "No");
        
    }    
}
