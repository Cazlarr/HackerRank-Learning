package Java.Strings;
// https://www.hackerrank.com/challenges/java-regex/problem
/* Original Solution:

class MyRegex{
    String pattern = "(25[0-5]|2[0-4][0-9]|[0-1]?[0-9]?[0-9])\\.(25[0-5]|2[0-4][0-9]|[0-1]?[0-9]?[0-9])\\.(25[0-5]|2[0-4][0-9]|[0-1]?[0-9]?[0-9])\\.(25[0-5]|2[0-4][0-9]|[0-1]?[0-9]?[0-9])";
    
}

*/
public class Regex {
    String validNums = "(25[0-5]|2[0-4][0-9]|[0-1]?[0-9]?[0-9])";
    String regexPeriod = "\\.";
    String pattern = validNums + regexPeriod + validNums + regexPeriod + validNums + regexPeriod + validNums;
}

/*
Regex is one of those things that gets easier the more you do it, but you never do it.
Props to Dorku for reminding me that I don't need a 150+ length string as my answer:
https://www.hackerrank.com/challenges/java-regex/forum/comments/90967
*/
