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

class Result9 {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long min =  arr.stream().sorted(Integer::compareTo).limit(4).mapToLong(Long::valueOf).reduce(Long::sum).getAsLong();
        long max =  arr.stream().sorted(Integer::compareTo).skip(1).mapToLong(Long::valueOf).reduce(Long::sum).getAsLong();
        System.out.print(min+"\s"+max);
    }

}

public class Solution9 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result9.miniMaxSum(arr);

        bufferedReader.close();
    }
}
