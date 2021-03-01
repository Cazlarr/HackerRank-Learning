package Java.Introduction;
// https://www.hackerrank.com/challenges/java-loops-i/problem
// Completed 2018

import java.util.*;

public class LoopsOne {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(N + " x " + i + " = " + (i*N));
        }
    }   
}
