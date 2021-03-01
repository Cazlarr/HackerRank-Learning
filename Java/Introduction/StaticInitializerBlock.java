package Java.Introduction;
// https://www.hackerrank.com/challenges/java-static-initializer-block/problem
// Complete 2018
import java.util.*;

public class StaticInitializerBlock {
    private static final int B;
    private static final int H;
    private static final boolean flag;
    
    static {
    
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();
        
        if(B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else {
            flag = true;
        }
    }
        
}
