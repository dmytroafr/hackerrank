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

class Result7 {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        BigDecimal size = BigDecimal.valueOf(arr.size());
        BigDecimal pos = BigDecimal.valueOf(arr.stream().filter(i->i>0).count()).divide(size,6,RoundingMode.DOWN);
        BigDecimal neg = BigDecimal.valueOf(arr.stream().filter(i->i<0).count()).divide(size,6,RoundingMode.DOWN);
        BigDecimal zer = BigDecimal.valueOf(arr.stream().filter(i->i==0).count()).divide(size,6,RoundingMode.DOWN);

        System.out.print(pos +"\n"+neg +"\n"+zer);
    }

}

public class Solution7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result7.plusMinus(arr);

        bufferedReader.close();
    }
}
