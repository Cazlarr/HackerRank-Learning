package Java.Strings;

// https://www.hackerrank.com/challenges/duplicate-word/problem
// I DID NOT SOLVE THIS! I learned a lot from the people who did though.
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTwo {

    public static void main(String[] args) {

        String regex = "\\b([a-z]|[A-Z]+)(\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(0), m.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}

/*
 * This problem required a template to be changed in three places:
 * 
 * 1 - Line 12: the value of regex
 * 
 * 2 - Line 13: the flag for Pattern.compile
 * 
 * 3 - Line 25: the regex and String for the replaceAll
 * 
 * The result of these changes should be code that that identifies repeating
 * words, without case-sensitivity, and replaces them with the first instance of
 * the word.
 * 
 * I was miles off on change 1, correct on change 2, and close on change 3, on
 * my solo attempt.
 * 
 * The main understanding I was missing for building correct regex was the idea
 * of "capturing groups", ie the expressions wrapped in parenthesis. Using
 * capturing groups allows you to point at one and match it, or ignore it, or do
 * anything specific to the nth captured group - it is a very powerful tool.
 * 
 * The regex breaks down like this:
 * 
 * \\b - Denotes the word boundary of the first word (without this, a match
 * could be found halfway through a word)
 * 
 * ([a-z]|[A-Z]+) - This captures any word without numbers (\w includes numerals
 * in its word classification)
 * 
 * (\\s+ - This allows for any amount of spaces between the previous word and
 * this one
 * 
 * \\1 - This magical one says "Copies what was found in the first parenthesis"
 * - notation in docs is \n
 * 
 * \\b - This denotes that the word must end after the sequence (this is needed
 * to stop copying partial word starts for copies)
 * 
 * )+ - Finally, this captures further repetitions (again, space separated and
 * marked as word ends!)
 * 
 * 
 * All credit for this solution goes to Rodney:
 * https://www.hackerrank.com/challenges/duplicate-word/forum/comments/249042
 * And 4godspeed (for the updated regex):
 * https://www.hackerrank.com/challenges/duplicate-word/forum/comments/503715
 * 
 * Rodney pointed to this tutorial as his guide for the solution:
 * http://tutorials.jenkov.com/java-regex/matcher.html which does a fantastic
 * job of explaining the Matcher.group() method for change 3.
 */
