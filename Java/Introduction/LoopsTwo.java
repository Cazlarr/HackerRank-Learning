package Java.Introduction;
// https://www.hackerrank.com/challenges/java-loops/problem
// Completed 2018
import java.util.*;

public class LoopsTwo {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int tote = a + b;
            System.out.print(tote + " ");
            for(int j=1; j<n; j++){
                tote = (int)Math.pow(2,j)*b + tote;
                System.out.print(tote + " ");
            }
            System.out.print("\n");
        }
        in.close();
    }    
}
