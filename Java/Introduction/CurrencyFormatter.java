package Java.Introduction;
// https://www.hackerrank.com/challenges/java-currency-formatter/problem

import java.util.*;
import java.text.*;

public class CurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        // String india = NumberFormat.getCurrencyInstance(Locale.INDIA).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: Rs." + us.substring(1));
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }    
}

/*
I only later found out that you can add new Locales with just their identifiers:
    `Locale indiaLocale = new Locale("en", "IN");`
Courtesy of Rodney:
https://www.hackerrank.com/challenges/java-currency-formatter/forum/comments/247934
*/
