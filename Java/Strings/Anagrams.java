package Java.Strings;
// https://www.hackerrank.com/challenges/java-anagrams/problem
import java.util.Scanner;

public class Anagrams {
    
    static boolean isAnagram(String a, String b) {
        // Complete the function
        int aLen = a.length();
        if (aLen != b.length()) return false;
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        java.util.HashMap<Character, Integer> cMap = new java.util.HashMap<>();
        for (int i=0; i<aLen; i++) {
            char thisChar = a.charAt(i);
            if (cMap.containsKey(thisChar)) cMap.put(thisChar, cMap.get(thisChar) + 1);
            else cMap.put(thisChar, 1);
        }
        
        for (int i=0; i<aLen; i++) {
            char thisChar = b.charAt(i);
            if (cMap.containsKey(thisChar)) {
                int count = cMap.get(thisChar);
                if (count <= 0) return false;
                cMap.put(thisChar, count - 1);
            }
            else return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }    
}
