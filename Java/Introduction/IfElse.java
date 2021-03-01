package Java.Introduction;
// https://www.hackerrank.com/challenges/java-if-else/problem
// Completed 2018

import java.util.*;

public class IfElse {
    
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();            
        String ans="";
        if(n%2==1){
          ans = "Weird";
        }
        else{
            if(2<=n && n<=5){
                ans = "Not Weird";
            }
            else if(6<=n && n<=20) {
                ans = "Weird";
            }
            else {
                ans = "Not Weird";
            }
        
           //Complete the code
            
        }
        System.out.println(ans);
        
    }
}
