package Java.Strings;
// https://www.hackerrank.com/challenges/java-string-tokens/problem
import java.util.*;


public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        if (s.length() > 400000) return;
        s = s.trim();
        if (s.length() > 0) {
            String[] plit = s.split("[ !,?._'@]+");
            System.out.println(Integer.toString(plit.length));
            for (String token: plit) System.out.println(token);   
        }
        else System.out.println("0");
    }    
}
