package org.example.third;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result8 {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        // Write your code here
        IntStream.range(0,n).mapToObj(i->{
            StringBuilder s = new StringBuilder();
            s.append(" ".repeat(n - 1 - i));
            s.append("#".repeat(i + 1));
            return s.toString();
        }).forEach(System.out::println);
    }

}

public class Solution8 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result8.staircase(n);

        bufferedReader.close();
    }
}
