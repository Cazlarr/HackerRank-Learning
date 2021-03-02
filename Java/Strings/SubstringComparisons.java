package Java.Strings;
// https://www.hackerrank.com/challenges/java-string-compare/problem
import java.util.Scanner;


public class SubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String firstSS = s.substring(0, k);
        int sLen = s.length();
        smallest = firstSS;
        largest = firstSS;
        for (int i=1; i<=(sLen-k); i++) {
            String thisSS = s.substring(i, i+k);
            if (smallest.compareTo(thisSS) > 0) smallest = thisSS;
            if (largest.compareTo(thisSS) < 0) largest = thisSS;
        }
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }    
}
