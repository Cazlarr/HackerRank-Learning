package Java.Introduction;
// https://www.hackerrank.com/challenges/java-stdin-stdout/problem
// Completed 2018
import java.util.Scanner;

public class StdinAndStdoutTwo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String dump = scan.nextLine();
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
