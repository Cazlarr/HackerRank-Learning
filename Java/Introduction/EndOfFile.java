package Java.Introduction;
// https://www.hackerrank.com/challenges/java-end-of-file/problem
// Completed 2018
import java.util.*;

public class EndOfFile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int line = 0;
        while(scan.hasNext())
        {
            line += 1;
            System.out.println(line + " " + scan.nextLine());           
        } 
    }
}
