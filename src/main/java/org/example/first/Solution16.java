package org.example.first;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution16 {
    public static void main(String[] args) {
//          ?+
//        Goodbye bye bye world world world

        String regex = "(?i)\\b(\\w+)\\b\\s+(\\b\\1\\b\\s*)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern

            while (m.find()) {

                input = input.replaceAll(regex, "$1 " );
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}